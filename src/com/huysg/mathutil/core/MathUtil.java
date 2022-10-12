/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huysg.mathutil.core;

/**
 *
 * @author user
 */
// Ta sẽ mô phỏng / clone cái Class Math của JDK
// Class của ta viết sẽ cung cấp các hàm / method tiện ích dùng chung 
// Cho nhiều nơi khác nhau 
// Thường cái gì mà là tiện ích / tool dùng cho các nơi thì nó sẽ 
// được thiết kế là Static
public class MathUtil {

    public static final double PI = 3.141592653589793;

    // Hàm tiện ích dùng chung tính giai thừa !!!
    // Quy ước n! = 1.2.3..n
    // ko tính giai thừa âm
    // 0! = 1! = 1
    // 21! cực kì to , vượt 18 số 0 là tràn kiểu long 
    // ta quy ước không tin 21! trở lên , vì tràn long
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invaild n. n must be between 0..20 ");
        
        if (n == 0 || n == 1) 
            return 1;
        
        // sống sót đến đây , sure , n chạy từ 2..20 
        long product = 1; // khởi đầu giai thừa là 1 
        // biến tích lũy / gửi góp / nhân dồn / con heo đất
        // acc - accumulation
        for (int i = 2; i <= n; i++) 
            product *= i; // product = product * i 
        
        return product;
    }

}

//KĨ THUẬT TDD - TEST DRIVEN DEVELOPMENT
// LÀ KĨ THUẬT LẬP TRÌNH / PHONG CÁCH LẬP TRÌNH MÀ KHI VIẾT CODE THÌ PHẢI
// VIẾT LUÔN CÁC BỘ KIỂM THỬ - TEST CASES ĐỂ KIỂM TRA NGAY CODE CỦA MÌNH 
// CHẠY ĐÚNG HAY SAI 
// LÀ KĨ THUẬT LẬP TRÌNH VIẾT  CODE SONG SONG VOOIWTS VIẾT CÁC TEST CASES
// KĨ THUẬT NÀY GIÚP CODE LIÊN TỤC ĐƯỢC KIỂM TRA XEM MÀY CHẠY 
// CÓ ĐÚNG NHƯ KÌ VỌNG HAY KO?
// NẾU TA XÀI TDD, NÓ GIÚP TA ĐI VÀO QUY TRÌNH CI - CONTINUOS INTERGRATION
// ĐỂ LÀM TĐ TA : 
// 1. VIẾT PHÁC THẢO PROTOTYPE CỦA HÀM / METHOD / CLASS
// 2. VIẾT CÁC BỘ KIỂM TRHUWR / TEST CASES LÀ CÁC ĐOẠN CODE BỔ SUNG THÊM
// NHƯNG LÀ CODE ĐỂ XÀI CÁI HÀM VỪA VIẾT , ĐỂ CHECK XEM HÀM VỪA VIẾT
// ỔN KHÔNG 
// 3. CHẠY THAUWR HÀM VỪA VIẾT VỚI BỘ TEST CASE VỪA TẠO, XEM TÌNH HÌNH HÀM 
// ĐÚNG SAI RA SAO. SAI -> REACTOR, SỬA CODE 
//                  ĐÚNG - > HOÀN THIỆN TIẾP CODE KHÁC
// LIÊN TỤC LIÊN TỤC NHƯ VẬY !!!
