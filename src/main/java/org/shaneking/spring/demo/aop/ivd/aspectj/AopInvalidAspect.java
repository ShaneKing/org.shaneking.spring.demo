package org.shaneking.spring.demo.aop.ivd.aspectj;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.shaneking.spring.demo.aop.ivd.annotation.AopInvalidAnno;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class AopInvalidAspect {

  @Pointcut("execution(@org.shaneking.spring.demo.aop.ivd.annotation.AopInvalidAnno * *..*.*(..))")
  private void pointcut() {
  }

  @Around("pointcut() && @annotation(aopInvalidAnno)")
  public Object aroundCurrentLimiter(ProceedingJoinPoint joinPoint, AopInvalidAnno aopInvalidAnno) throws Throwable {
    log.info(joinPoint.getSignature().getName() + System.currentTimeMillis());
    Object rtn = joinPoint.proceed();
    log.info(joinPoint.getSignature().getName() + System.currentTimeMillis());
    return rtn;
  }
}
