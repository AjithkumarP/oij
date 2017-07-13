package com.mycompany.app;
class B1
{
    String name;
    int id;
    public void B1(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
  public int getId()
  {
      return this.id;
  }
 public void setId(int id)
  {
      this.id=id;
  }
  public String getName()
  {
      return this.name;
  }
  public void setName(String name)
  {
      this.name=name;
  }
/*  public String toString()
  {
      return "id :"+id+" name: "+name;
  }*/
}