package com.metacoding.projectwc._core.aop;

import com.metacoding.projectwc._core.error.ex.APIException403;
import com.metacoding.projectwc._core.error.ex.APIException404;
import com.metacoding.projectwc._core.error.ex.Exception403;
import com.metacoding.projectwc._core.error.ex.Exception404;
import com.metacoding.projectwc.user.User;
import com.metacoding.projectwc.worldcup.Worldcup;
import com.metacoding.projectwc.worldcup.WorldcupRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Aspect
@Component
public class WorldcupAspect {
    @Autowired
    private HttpServletRequest httpServletRequest;

    @Autowired
    private WorldcupRepository worldcupRepository;

    @Before("execution(* com.metacoding.projectwc.worldcup.WorldcupController.wcFormById(..))||" +
            "execution(* com.metacoding.projectwc.worldcup.WorldcupController.delete(..))||" +
            "execution(* com.metacoding.projectwc.worldcup.WorldcupController.update(..))||" +
            "execution(* com.metacoding.projectwc.worldcup.item.WorldcupItemController.updateImg(..))||" +
            "execution(* com.metacoding.projectwc.worldcup.item.WorldcupItemController.updateImg(..))||" +
            "execution(* com.metacoding.projectwc.worldcup.item.WorldcupItemController.delete(..))||" +
            "execution(* com.metacoding.projectwc.worldcup.item.WorldcupItemController.save(..))")
    public void worldcupUserCheck(JoinPoint joinPoint) {
        User sessionUser = (User) httpServletRequest.getSession().getAttribute("sessionUser");
        String url = httpServletRequest.getRequestURL().toString();
        String regex = ".*/worldcups/(\\d+).*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);
        matcher.matches();
        int id = Integer.parseInt(matcher.group(1));
        if (joinPoint.getSignature().getName().equals("wcFormById")) {
            Worldcup worldcupPS = worldcupRepository.findById(id).orElseThrow(() -> new Exception404("없는 월드컵입니다."));
            if (!worldcupPS.getUser().getId().equals(sessionUser.getId())) {
                throw new Exception403("다른 유저의 월드컵입니다.");
            }
        } else {
            Worldcup worldcupPS = worldcupRepository.findById(id).orElseThrow(() -> new APIException404("없는 월드컵입니다."));
            if (!worldcupPS.getUser().getId().equals(sessionUser.getId())) {
                throw new APIException403("다른 유저의 월드컵입니다.");
            }
        }
    }
}