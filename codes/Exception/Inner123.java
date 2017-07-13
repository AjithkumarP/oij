 anonymous an = new anonymous()
          {
           
              public void anonymousM()
              {
                  System.out.println("Im anonymous");
              }
           };

           void createObj()
           {
             anonymous an = new anonymous();
             an.anonymousM();        //  new anonymous().anonymousM();
           }