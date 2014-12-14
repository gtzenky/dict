package com.example.android.searchabledict;

public class Word {
  private String word;
  private String index;
  private String definition;
  
  public Word(String word, String index) {
    this.word = word;
    this.index = index;
  }
  
  public String getWord() {
    return word;
  }
  public String getIndex() {
    return index;
  }
  public String getDefinition() {
    return definition;
  }
  
  
}
