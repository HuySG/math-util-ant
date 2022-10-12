/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huysg.mathutil.main;

import com.huysg.mathutil.core.MathUtil;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        tryTDDFirst();
        System.out.println("This message comes from the main() method");
        System.out.println("This jar file í built base ANT co-operating with JUnit!");
    }

    // Hmà này dùng để demo/ minh họa cách dùng TDD được triển khai thế nào
    // viết code song song với viết test 
    // Test         Drivent     Development
    // kiểm thử     hướng về    viết code 
    private static void tryTDDFirst() {

        //TEST CASE #1: ( tình huống xài hàm số #1)
        // input n = 0 ; ta muốn thử tính 0! coi hàm chạy ra soa
        //expected = 1; ta muốn 0 ! hàm pphair trả về 1!!!
        // thực tế actual = ? mấy, chạy thử hàm mới biết được 
        long expected = 1; // mình muốn 0! trả về 1 
        long actual = MathUtil.getFactorial(0);
        // kiểm thử pm là so sánh giữa expected và actual 
        // để luận đúng sai 
        System.out.println("0! Status | expected: " + expected
                + " | actual: " + actual);

        // TEST CASE #2 
        // kiểm tra hàm có chạy đúng với 2!, hy vọng nhận về số 2 
        // input n = 2;
        // expected nhận về phải là 2
        // thực tế là mấy ??? chạy mới biết
        System.out.println("2! Status | expected: 2"
                + " | actual: " + MathUtil.getFactorial(2));

        // TEST CASE #3
        // n = 5, 5! hy vọng trả về 120 
        System.out.println("5! Status | expected: 120"
                + " | actual: " + MathUtil.getFactorial(5));

        // TEST CASE #4
        // n = -5, -5!, hy vọng bị đạp vào mặt câu, CÀ CHỚN , N KO HỢP LỆ
//        System.out.println("-5! Status | expected: NGOẠI LỆ XUẤT HIỆN"
//                + " | actual: " + MathUtil.getFactorial(-5));
//        System.out.println("-5! Status | expected: NGOẠI LỆ XUẤT HIỆN"
//                + " | actual: "); 
//        MathUtil.getFactorial(-5);
    }
}

//TỔNG KẾT: 
// TEST CASE LÀ GÌ ?? TÌNH HUỐNG KIỂM THỬ 
// LÀ NHỮNG TÌNH HUỐNG XÀI APP/ KIỂM THỬ APP XEM APP CHẠY CÓ ĐÚNG HAY KO 
// TEST CASE BAO GỒM 
// - DATA ĐƯA VÀO HÀM/ APP, VÍ DỤ 5 ĐƯA VÀO HÀM GIAI THỪA 
// - GỌI HÀM ĐỂ XỬ LÍ DATA ĐƯA VÀO, GETFACTORIAL(5)
// - GIÁ TRỊ KÌ VỌNG HÀM SẼ TRẢ VỀ EXPECTED VALUE == 120 ??
// - STATUS: HÀM CHẠY ĐÚNG HAY SAI 
// MỘT TEST CASE LÀ 1 TÍNH HUỐNG SÀI APP / KIỂM THỬ APP ĐÚNG HAY SAI SO VỚI 
// KÌ VỌNG KHI TA ĐƯA DATA CỤ THỂ NÀO ĐÓ VÀO APP / VÀO HÀM 
// 