package org.demo;

import java.io.IOException;
import org.demo.Producer;

public class Consumer {

  public static void main(String[] args) throws IOException {

    Producer p = new Producer();
    System.out.println(p.hello());
  }

}
