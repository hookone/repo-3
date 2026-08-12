@RestController
public class UserController{
  @GetMapping("/hello")
  public String hello(){
    System.out.println("UserController中的hello方法执行了");
	System.out.println("UserController中的userController执行了");
    return "hello git!";
  }
}
