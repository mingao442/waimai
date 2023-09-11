package reggie.common;

public class basecontext {
    private static ThreadLocal<Long> threadLocal=new ThreadLocal<>();

    public static void setcurrentId(Long id){
        threadLocal.set(id);
    }
    public static Long getcurrentId(){
        return threadLocal.get();
    }
}
