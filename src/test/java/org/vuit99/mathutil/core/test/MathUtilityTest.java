/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.vuit99.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.vuit99.mathutil.core.MathUtility;


public class MathUtilityTest {
  @Test
  public void testFactorialGivenRightArgumentReturnWell(){
      //assertEquals(68, 68);
      assertEquals(1, MathUtility.getFactorial(0));
      assertEquals(1, MathUtility.getFactorial(1));
      assertEquals(2, MathUtility.getFactorial(2));
      assertEquals(6, MathUtility.getFactorial(3));
      assertEquals(24, MathUtility.getFactorial(4));
      assertEquals(120, MathUtility.getFactorial(5));
  }
  
  //HỌC KĨ THUẬT KIỂM THỬ CHO DÂN DEV - KĨ THUẬT DDT
  //DATA DRIVEN TESTING
  
  //TDD: TEST DRIVEN DEVELOPMENT 
  //Kĩ thuật lập trình mà dân dev viết code đến đâu thì viết test case đến đó(JUnit, NUnit, Mocha) và dùng 2 màu xanh đỏ để dảm
  //bảo chất lượng code/ chất lượng hàm!!
  
  //học kĩ thuật kiểm thử cho dân dev = DDT
  //DDT: DATA DRIVEN TESTING - BỔ TRỢ CHO VIỆC XÀI UNIT TEST
  // GIÚP CÁC TEST CASE ĐỂ ĐỌC HƠN, ĐỂ DỄ BẢO TRÌ HƠN
  //PHẦN MỞ RỘNG THÊM TDD
  
  //LÀ KĨ THUẬT VIẾT CODE KIỂM THỬ MÀ TÁCH BỘ DATA KIỂM THỬ
  //RA KHỎI CÂU LỆNH ASSERTEQUALS() CHO DỄ KIỂM SOÁT TEST CASE.
  
  //DTT là phần mở rộng thêm cho TDD tức là giúp cho code test (Unit test)
  // trở nên dễ dàng đọc, bảo trì, dễ dàng phát hiện thiếu testcase
  
  //DDT TÁCH DATA KIỂM THỬ RA 1 CHỖ RIÊNG, THƯỜNG LÀ MẢNG 2 CHIỀU
  // CÓ NHIỀU CỘT, CỘT CHÍNH LÀ DATA ĐƯA VÀO VÀ EXPECTED
  //VÀ TA CẦN CÓ NHIỀU DÒNG NHƯ THẾ, ỨNG VỚI CÁC TEST CASE
  
  //VÀ MẢNG HAI CHIỀU NÀY FILL TỪ TỪ VÀO TRONG HÀM ASSERTEQUALS()
  //KĨ THUẬT TÁCH DATA TEST RIÊNG RA 1 CHỖ GỌI LÀ DDT
  //DATA DRIVEN TESTING- VIẾT CODE TEST HƯỚNG VỀ VIỆC TÁCH DATA
  
  //DATA ĐUỌC ĐƯA VÀO TRỞ LẠI QUA CÁC THAM SỐ, BIẾN ĐẠI DIỆN
  //NÉN DDT CÒN LÀ: PARAMETERZIED TESTING
}
