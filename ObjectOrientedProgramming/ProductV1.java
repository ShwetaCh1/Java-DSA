

package ObjectOrientedProgramming;

public class ProductV1 {

  private String name;
  private BrandV1 brand;
  private String description;
  private Image[] images;

  public ProductV1(BrandV1 brand, String name) {
    this.name = name;
    this.brand = brand;
    this.images = new Image[3];
  }
  
  public String getName() {
    return name;
  }

  public BrandV1 getBrand() {
    return brand;
  }
  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Image[] getImages() {
    return images;
  }

  public void setImages(Image[] images) {
    this.images = images;
  }
  
  public void addImage(Image image) {
    for (int i = 0; i < this.images.length; i++) {
      if (null == this.images[i]) {
        this.images[i] = image;
        return;
      }
    }
  }
  
  public Image getDefaultImage() {
    for (int i = 0; i < this.images.length; i++) {
      if (this.images[i].isDefaultImg()) {
        return this.images[i];
      }
    }
    return null;
  }
}

//https://docs.google.com/presentation/d/1cROVfWR2pp_CTPQ-br1FBKjJFjALE6SP7o4E-HcbYd0/edit#slide=id.g777c76af17_0_1029:41 pm 
