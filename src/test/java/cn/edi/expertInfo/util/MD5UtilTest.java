package cn.edi.expertInfo.util;

import static org.junit.Assert.*;

import org.junit.Test;

import cn.edi.expertInfo.util.MD5Util;

public class MD5UtilTest {


  @Test
  public void crypt() {
    System.out.println(MD5Util.crypt("0000"));
  }
}