package cn.edu.fjnu.towide.entity;

import lombok.Data;

@Data
public class TagManagement {

  private String tagId;
  private String tagName;


  public String getTagId() {
    return tagId;
  }

  public void setTagId(String tagId) {
    this.tagId = tagId;
  }


  public String getTagName() {
    return tagName;
  }

  public void setTagName(String tagName) {
    this.tagName = tagName;
  }

}
