package hello.core.beanfind;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// 스프링 컨테이너 빈 데이터 조회 test
class ApplicationContextInfoTest { // Junit5 부터는 public 안해도 됨

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("모든 빈 출력하기")
    void findAllBean() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames(); // ctrl + alt + v. 정의된 모든 빈을 등록
        for (String beanDefinitionName : beanDefinitionNames) { // iter + tab하면 for문 자동 생성
            Object bean = ac.getBean(beanDefinitionName); // type 지정안해서 Object로 설정 됨
            System.out.println("name = " + beanDefinitionName + "object = " + bean); // key, value
        }
    }

        @Test
        @DisplayName("애플리케이션 빈 출력하기") // 내가 등록한 빈만 출력하고 싶음
        void findApplicationBean() {
            String[] beanDefinitionNames = ac.getBeanDefinitionNames();
            for (String beanDefinitionName : beanDefinitionNames) {
                BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);// bean 하나하나의 정보를 가져옴
                // ROLE_INFRASTRUCTURE: 스프링이 내부에서 사용하는 빈
                if(beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION){ // ROLE_APPLICATION: 직접 등록한 애플리케이션 빈
                    Object bean = ac.getBean(beanDefinitionName); // type 지정안해서 Object로 설정 됨
                    System.out.println("name = " + beanDefinitionName + "object = " + bean);
                }
        }

    }



}
