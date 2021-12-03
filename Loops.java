class Numbers {
    public static void main(String[] args) {
      for (int i = 0; i < 100; i++) {
        // Add your code below
        if (i % 5 != 0){
           continue;
        }
        System.out.println(i);  
    }
      int x = 0;
      while (x <= 10){
          if (x%3 == 0){
              x++;
              continue;
          }
            
          else{
              System.out.println(x);
              x++;
          }
      }
    }
  }