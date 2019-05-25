package ru.chekov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//в данном классе тестируется spring
//то есть в applicationContext.xml (конфигурационный файл Spring) создаётся объект и он попадает в application context и
// мы обратимся к application context для получения объекта
public class TestSpring {
    public static void main(String[] args) {
        //данный класс обращается к applicationContext.xml, считывает его и помещает все бины в application context
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        TestBean testBean=context.getBean("testBean",TestBean.class);
        System.out.println(testBean.getName());

        context.close();

    }
}
