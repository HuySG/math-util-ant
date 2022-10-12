package com.huysg.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilTest {

    // Kiểm thử tình huống cà chớn, đưa data vào cà chớn 
    // thì nhận về cú tát EXCEPTION
    // hàm getFactorial() được thiết kế để:
    // - nếu đưa vào n tử tế 0..20 -> sure phải ra 1 con n! đúng đắng
    // - nếu đưa vào n cà chớn n < 0 || n > 20 
    // CHỬI CHỬI VÀ CHỬI  = NÉM RA EXCEPTION // ILILEGALARGUMENTEXCEPTION
    // Bây giờ, nếu tui đưa -5 cho hàm, tui nhận về gì ??? ngoại lệ 
    // Thấy ngoại lệ mừng rơi nước mắt 
    // THẤY NGOẠI LỆ NHƯ KÌ VỌNG Ở -5! => VIẾT CODE ĐÚNG RỒI, MÀU XANH 
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException() {

        // Test Case #6:
        // n = -5; -5! hy vọng Expected vả vào mặt cái EXECPTION
        //            thực tế Actual có vả vào mặt hay ko, đoán xem, chạy hàm đã đúng ko
        // ko xài asserEquals() vì nó dùng cho các giá trị cụ thể 
        // còn ngoại lệ là 1 thứ đo lường = cách mày có xuất hiện hay ko
        // mày ko là 1 giá trị kiểu 5 10 15 20 
        MathUtil.getFactorial(-5); // Ngoại lệ cầm chắc trong tray 
                                   // nhưng phải đo/dòm mày có xuất hiện hay ko ??
    }

    @Test
    public void testFactorialGivenRightArgumentReturnWell2() {

        //Test Case #4
        // n = 3; 3! hy vọng expected trả về 6, 
        //        thực tế actual là mấy, đoán xem
        Assert.assertEquals(6, MathUtil.getFactorial(3));

        //Test Case #5
        // n = 4; 4! hy vọng expected trả về 24, 
        //        thực tế actual là mấy, đoán xem
        Assert.assertEquals(24, MathUtil.getFactorial(4));

        //Test Case #6
        // n = 5; 5! hy vọng expected trả về 120, 
        //        thực tế actual là mấy, đoán xem
        Assert.assertEquals(120, MathUtil.getFactorial(5));
    }

    @Test
    public void tryAssertion() {
        Assert.assertEquals(69, 69);
    }

    @Test   // quy tắc đặt tên hàm phải mang ý nghĩa của testcasse 
    // case mình muốn test hàm - CODDING CONVENTION
    public void testFactorialGivenRightArgumentReturnWell() {

        // Test Case @1: - tình huống kiểm thử xài hàm getF() đầu tiên 
        // n = 0, 0! hy vọng expected = 1; actual thực tế là mấy, đoán xem
        //                                  gọi hàm, chạy hàm mới biết được
        // nếu expected == actual, hàm đúng, MÀU XANH
        // nếu expected != actual, có gì đó SAI SAI
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        // phải so sánh 2 giá trị này !! dùng Framework, hong sài sout()
        Assert.assertEquals(expected, actual);
        // vietSub: so sánh 0! có đúng trả về 1 hay hem ?
        //Test Case #2
        // n = 1, hy vọng expected trả về 1, 
        //        thực tế actual là mấy, đoán xem
        expected = 1;
        actual = MathUtil.getFactorial(0);
        Assert.assertEquals(expected, actual);
        //Test Case #3
        // n = 2, hy vọng expected trả về 2, 
        //        thực tế actual là mấy, đoán xem
        Assert.assertEquals(2, MathUtil.getFactorial(2));
    }

}

// TRONG CLASS NÀY CHỨA CÁI GÌ ???
// CLASS NÀY CHỨA CÁC ĐOẠN CÁC ĐOẠN CODE DÙNG ĐỂ TEST CODE CHÍNH Ở BÊN THƯ MỰC
// SOURCE PACKAGES
// CÁC ĐOẠN CODE Ở ĐÂY DÙNG ĐỂ TEST HÀM GETFACTORIAL() COI MÀY
// CHẠY CÓ ĐÚNG KO
// VIẾT CODE ĐỂ TEST CODE 
// NHỮNG ĐOẠN CODE Ở TRONG NÀY DO DEVELOPER VIẾT RA DÙNG ĐỂ TEST CHÍNH 
// CÁI CODE Ở BÊN THƯ MỤC SOURCE ĐỂ ĐẢM BẢO RẰNG HÀM / CLASS VIẾT RA 
// PHẢI CHẠY ĐÚNG
// ĐOẠN CODE DÙNG ĐỂ TEST CODE THÌ ĐƯỢC GỌI LÀ TEST SCRIPT
// CÁC TEST SCRIPT NÀY SẼ CÓ LỆNH CƠ BẢN: SO SÁNH GIỮA EXPECTED VÀ ACTUAL 
// NHỮNG ĐOẠN CODE NÀY DÙNG KO LỆNH SOUT() TRUYỀN THỐNG MÀ DÙNG NHỮNG 
// THƯ VIỆN ĐẶC BIẾT ĐỂ 
// Khi hàm sai , Khi Expected ko giống như actual, thì nó NÉM RA MÀU ĐỎ 
// Khi hàm chạy đúng, tức là Expected == actual, thì nó NÉM RA MÀU XANH 
// Các thư viện giúp thảy ra màu xanh đỏ, tự so sánh giùm expected 
// và actual để kết luận hàm đúng sai, mắt lúc này chỉ cần nhìn đúng 
// 2 MÀU XANH ĐỎ, K O CẦN XE CHI TIẾT CÁC DÒNG SO SÁNH NHƯ BÊN MAIN()
// BỘ THƯ VIÊN NÀY CÒN GỌI LÀ UNIT TEST FRAMEWORK 
// MỖI NGÔN NGỮ LẬP TRÌNH ĐỀU CÓ VÀI BỘ THƯ VIỆN THẢY RA MÀU XANH ĐỎ 
// GIÚP CÁC TEST HÀM CỦA MÌNH 
// VÍ DỤ:
// JAVA: JUnit, TestNG
// C#: xUnit, NUnit, MSTest
// pHp: phpUnit
// JavaScript: ....
// Python:....
// BÀI TẬP VỀ NHÀ HÃY THIẾT TRÌNH Unit Test Framework cho ngôn ngữ lập trình  ( chọn 1 Unit Test Famework demo trước lớp )
// @Test được gọi là 1 flag/ cờ đánh dấu - ANNOTATION
// báo hiệu cho thư viện JUnit BIẾT CẦN GENERATE HÀM ĐI KÈM @TEST
// BIẾN HÀM NÀY THÀNH HÀM MAIN() VÀ GỬI MAIN() CHO JVM - JAVA
// VIRTUAL MACHINE BIẾT ĐỂ CHẠY, KHI CHẠY THÌ SO SÁNH 2 ĐỨA
// EXPECTED VÀ ACTUAL, COI NẾU CHÚNG == NHAU, THẤY MÀU XANH
//                         NẾU CHÚNG != NHAU, THẤY MÀU ĐỎ
// NẾU KO CÓ @TEST, CHẢ CÓ HÀM MAIN() NÀO ĐƯỢC GENERATE, NO RUNABLE TEST METHOD 
// VIỆC XÀI THƯ VIỆN MÀ BỊ ÉP PHẢI LÀM NHỮNG GÌ ĐÓ, THEO QUY TẮC NÀO ĐÓ
// GỌI LÀ FRAMEWORK
// CHỐT DEAL XANH ĐỎ
// NẾU VIỆC CHẠY BỘ TEST CASE RA MÀU XANH, KHI VÀ CHỈ KHI
// XANH: KHI TẤT CẢ CÁC TEST CASE CÙNG XANH 
// XANH: KHI TẤT CẢ VIỆC SO SÁNH EXPECTED ĐỀU == ACTUAL 
// ĐỎ: CHỈ CẦN MỘT THẰNG TRONG ĐÁM TEST CASE MÀU ĐỎ, TẤT CẢ ĐỔ
// ĐỎ: CHỈ CẦN 1 VIỆC SO SANH EXPECTED != ACTUAL XUẤT HIỆN, MÀU ĐỎ FOR ALL 
// LOGIC: HÀM NẾU ĐÃ ĐÚNG THÌ PHẢI ĐÚNG TẤT CẢ CÁC CASE ĐƯỢC LIỆT KÊ RA 
// HÀM NGON VỚI CÁC CASE ĐÃ TEST 
// CỐ GẮNG LIỆT KÊ ĐƯỢC ĐỦ CASE LÀ TỐT NHẤT !!
// NGUYÊN LÝ SỐ 2 
// CHỐT DEAL 2 :
// KHI RA MÀU XANH TỔNG, HÀM ỔN VỚI CÁC TEST CASE 
// KHI RA MÀU ĐỎ, NGHĨA LÀ CÓ ÍT NHẤT MỘT VIỆC SO SÁNH EXPECTED != ACTUAL
// MÀU ĐỎ VÌ LÝ DO GÌ, VÌ SAO ?
// - DO ACTUAL TRẢ VỀ KO ĐÚNG KÌ VỌNG => BUG
// - DO EXPECTED TÍNH TOÁN KHÔNG ĐÚNG LUÔN !! QC BỊ NGÁO 
