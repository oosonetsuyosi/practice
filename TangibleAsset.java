public abstract class TanngibleAsset{
  private String nane;
  private int price;
  private String color;
  
  public TangibleAsset(String name,int price,String color){
    this.name = name;
    this.price = price;
    this.color = color;
  }
  public String getName(){return this.name;}
  public int getPrice(){return this.price;}
  ppublic String getColor(){return this.color;}
}
