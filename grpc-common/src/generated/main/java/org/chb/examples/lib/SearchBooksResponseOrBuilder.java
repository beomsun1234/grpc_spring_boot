// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package org.chb.examples.lib;

public interface SearchBooksResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SearchBooksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Book result = 1;</code>
   */
  java.util.List<org.chb.examples.lib.Book> 
      getResultList();
  /**
   * <code>repeated .Book result = 1;</code>
   */
  org.chb.examples.lib.Book getResult(int index);
  /**
   * <code>repeated .Book result = 1;</code>
   */
  int getResultCount();
  /**
   * <code>repeated .Book result = 1;</code>
   */
  java.util.List<? extends org.chb.examples.lib.BookOrBuilder> 
      getResultOrBuilderList();
  /**
   * <code>repeated .Book result = 1;</code>
   */
  org.chb.examples.lib.BookOrBuilder getResultOrBuilder(
      int index);
}
