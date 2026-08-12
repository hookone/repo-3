@RestController
public class UserController{
  @GetMapping("/hello")
  public String hello(){
    System.out.prinln("userCOntrller的hello方法执行了");
    Systme.out.println("ssf");
    return "hello git!";
  }
}
