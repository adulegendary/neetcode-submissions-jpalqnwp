static class Singleton {

    private static Singleton instance;
    private static String values;
    private Singleton() {
          values = null;
    }
    

    public static Singleton getInstance() {
           if(instance == null){
               instance = new Singleton();

           }
           return instance;
    }

    public String getValue() {
       // System.out.println(Singleton.values);
           return Singleton.values;
    }

    public void setValue(String value) {
         Singleton.values = value;
      
          System.out.println(Singleton.values);
    }
    
}
