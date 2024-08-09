public class OperatingSystemFactory {

    public OS getInstance(String str){

        if(str.equals("Powerful")){

            return new Android();
        }else if(str.equals("Secure")){

            return new IOS();
        }else{

            return new Windows();
        }
    }
}
