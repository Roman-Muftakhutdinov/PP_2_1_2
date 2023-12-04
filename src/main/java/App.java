import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat myCat = applicationContext.getBean("cat", Cat.class);
        Cat yourCat = applicationContext.getBean("cat", Cat.class);

        System.out.println("Ссылка на один и тот же объект?" + (bean == bean2));
        System.out.println("Ссылка на один и тот же объект?" + (myCat==yourCat));
    }
}