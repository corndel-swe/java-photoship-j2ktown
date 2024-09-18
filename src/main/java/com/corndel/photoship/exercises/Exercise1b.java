package com.corndel.photoship.exercises;

import java.util.List;

public class Exercise1b {
  // https://tech-docs.corndel.com/java/lists.html

  /**
   * Given an array, take the last element and put it on the front
   *
   * <p>
   * e.g. {"x", "y", "z"} => {"z", "x", "y"}
   *
   * @param {List<T>} list - The input list
   * @returns {List<T>} The list with the last element at the front
   */
  public static <T> List<T> arrayRotate(List<T> list) {
    if (list.size()> 0){
      T lastElement = list.get(list.size() - 1);
      list.remove(list.size() - 1);
      list.add(0, lastElement);
    }
    return list;
  }
}
