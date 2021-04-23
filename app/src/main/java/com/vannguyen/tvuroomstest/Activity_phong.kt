package com.vannguyen.tvuroomstest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_phong.*

class Activity_phong : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phong)
        supportActionBar?.setTitle("")
        val intent = intent
        var name : String = intent.getStringExtra("name")
        var arrayphong : ArrayList<Phong> = ArrayList()
        //arrayphong.clear()
        //A1 Done
        when(name){
            //A1
            "Phòng đào tạo SĐH - (Sau Đại học) - A11.101",                                            //1
            "Phòng Phó Hiệu trưởng - Trần Văn Trọng - A11.102",                                      //2
            "Trưởng phòng Công tác Sinh viên - Học sinh - A11.103",                                  //3
            "Văn phòng Đảng ủy - A11.104",                                                           //4
            "Phòng Công tác Sinh viên - Học sinh - A11.105",                                         //5
            "Phòng Phó Chủ tịch Hội đồng Tư Vấn - Lê Văn Dờn - A11.106",                             //6
            "Tổ Văn thư - A11.107",                                                                  //7
            "Phòng Trưởng phòng Hành chánh Tổ chức - A11.108",                                       //8
            "Phòng Hành chánh Tổ chức - A11.109",                                                    //9
            "Tổ Kiến thiết Cơ bản - A11.110",                                                        //10
            "Trung tâm dịch vụ việc làm - A11.111",                                                  //11
            "Trung tâm dịch vụ việc làm - A11.112",                                                  //12
                //2
            "Phòng Đào tạo - A11.201",                                                               //13
            "Phòng Trưởng phòng sau Đại học - A11.202",                                              //14
            "Phòng Chủ Tịch Hội đồng Tư Vấn - Trần Hoàn Kim - A11.203",                              //15
            "Phòng Phó Hiệu trưởng - Nguyễn Tiến Dũng - A11.204",                                    //16
            "Kho - A11.205",                                                                         //17
            "Phòng Khảo thí - A11.206",                                                              //18
            "Phòng họp Workshop 1 - A11.207",                                                        //19
            "Phòng Phó Hiệu trưởng - Thạch Thị Dân - A11.208",                                       //20
            "Phòng Quản trị Nhân sự - A11.209",                                                      //21
            "Phòng Trưởng phòng Nhân sự - A11.210",                                                  //22
            "Phòng Quản trị Thiết bị - A11.211",                                                     //23
            "Bản Quản lý đâu tư xây dựng - A11.212",                                                 //24
                //3
            "Phòng Kế hoạch Tài Vụ - A11.301",                                                       //25
            "Trưởng phòng Họp tác Quốc tế và Xúc tiến Dự án - A11.302",                              //26
            "Phòng Họp tác Quốc tế và Xúc tiến Dự án - A11.303",                                     //27
            "Kho - A11.304",                                                                         //28
            "Kho - A11.305",                                                                         //29
            "Phòng Đảm bảo Chất lượng - A11.306",                                                    //30
            "Phòng Khảo thí - A11.307",                                                              //31
            "Phòng hợp Workshop 2 - A11.308",                                                        //32
            "Phòng Trưởng phòng Khoa học Công nghệ - A11.309",                                       //33
            "Phòng Khoa học Công nghệ - A11.310",
            "A11.311",//34
            "Nhà khách B201 - A11.312",                                                              //35
            "Nhà khách B202 - A11.313",                                                              //36
            "Nhà khách B203 - A11.314",                                                              //37
            "Nhà khách B204 - A11.315",                                                              //38
            "Nhà khách B205 - A11.316",                                                              //39
            "Nhà khách B206 - A11.317",                                                              //40
                //4
            "Phòng Phó Chủ tịch Hội Đồng Tư vấn - Lê Quang Minh - A11.401",                          //41
            "Kho - A11.402",                                                                         //42
            "Phòng Quản trị và Khai thách mạng (kho) - A11.403",                                     //43
            "Phòng Phó Hiệu trưởng - Võ Hoàng Khải - A11.404",                                       //44
            "Trưởng phòng Thanh tra Pháp chế - A11.405",                                             //45
            "Phòng Thanh tra Pháp chế - A11.406",                                                    //46
            "Phòng họp Workshop 3 - A11.407",                                                        //47
            "Ban phát triển Hệ thống Công nghệ Thông tin - A11.408",                                 //48
                //5
            "Kho Văn thư Lưu Trữ - A11.501",                                                         //49
            "Phòng Hiệu trưởng - Phạm Tiết Khánh - A11.502",                                         //50
            "Phòng Thư ký Hiệu trưởng - A11.503",                                                    //51
            "Kho - A11.504",                                                                         //52
            "Phòng họp Workshop 4 - A11.505",                                                        //53
            "Tổ Quản trị và Khai thác mạng - A11.506",
            "A11.213",                                                                              //437
            "A11.318" -> {
                arrayphong.add(Phong("Bản đồ đường đi A1",R.drawable.ra1))
                arrayphong.add(Phong("Hình ảnh tòa A1", R.drawable.a1))
                when(name){
                    "Phòng Phó Hiệu trưởng - Nguyễn Tiến Dũng - A11.204",                                    //16
                    "Kho - A11.205","Kho - A11.304",                                                                         //28
                    "Kho - A11.305","Phòng Phó Chủ tịch Hội Đồng Tư vấn - Lê Quang Minh - A11.401",                          //41
                    "Kho - A11.402" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.a13))
                    }
                    "Phòng Trưởng phòng sau Đại học - A11.202",                                              //14
                    "Phòng Chủ Tịch Hội đồng Tư Vấn - Trần Hoàn Kim - A11.203","Trưởng phòng Họp tác Quốc tế và Xúc tiến Dự án - A11.302",                              //26
                    "Phòng Họp tác Quốc tế và Xúc tiến Dự án - A11.303","Phòng Quản trị và Khai thách mạng (kho) - A11.403" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.a14))
                    }
                    "Phòng Quản trị Thiết bị - A11.211","Nhà khách B201 - A11.312",                                                              //35
                    "Nhà khách B202 - A11.313",                                                              //36
                    "Nhà khách B203 - A11.314" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.a15))
                    }
                    "Bản Quản lý đâu tư xây dựng - A11.212","Nhà khách B204 - A11.315",                                                              //38
                    "Nhà khách B205 - A11.316",                                                              //39
                    "Nhà khách B206 - A11.317" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.a16))
                    }
                    "A11.213","A11.318" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.a17))
                    }
                    "Phòng đào tạo SĐH - (Sau Đại học) - A11.101",                                            //1
                    "Phòng Phó Hiệu trưởng - Trần Văn Trọng - A11.102",                                      //2
                    "Trưởng phòng Công tác Sinh viên - Học sinh - A11.103",                                  //3
                    "Văn phòng Đảng ủy - A11.104",                                                           //4
                    "Phòng Công tác Sinh viên - Học sinh - A11.105","Phòng Đào tạo - A11.201",
                    "Phòng Kế hoạch Tài Vụ - A11.301" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.a18))
                    }
                    "Phòng Khảo thí - A11.206",                                                              //18
                    "Phòng họp Workshop 1 - A11.207",                                                        //19
                    "Phòng Phó Hiệu trưởng - Thạch Thị Dân - A11.208",                                       //20
                    "Phòng Quản trị Nhân sự - A11.209",                                                      //21
                    "Phòng Trưởng phòng Nhân sự - A11.210","Phòng Đảm bảo Chất lượng - A11.306",                                                    //30
                    "Phòng Khảo thí - A11.307",                                                              //31
                    "Phòng hợp Workshop 2 - A11.308",                                                        //32
                    "Phòng Trưởng phòng Khoa học Công nghệ - A11.309",                                       //33
                    "Phòng Khoa học Công nghệ - A11.310",
                    "A11.311","Trưởng phòng Thanh tra Pháp chế - A11.405",                                             //45
                    "Phòng Thanh tra Pháp chế - A11.406",                                                    //46
                    "Phòng họp Workshop 3 - A11.407",                                                        //47
                    "Ban phát triển Hệ thống Công nghệ Thông tin - A11.408" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.a112))
                    }
                    "Kho Văn thư Lưu Trữ - A11.501",                                                         //49
                    "Phòng Hiệu trưởng - Phạm Tiết Khánh - A11.502",                                         //50
                    "Phòng Thư ký Hiệu trưởng - A11.503",                                                    //51
                    "Kho - A11.504" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.a113))
                    }
                    "Phòng Phó Chủ tịch Hội đồng Tư Vấn - Lê Văn Dờn - A11.106",                             //6
                    "Tổ Văn thư - A11.107",                                                                  //7
                    "Phòng Trưởng phòng Hành chánh Tổ chức - A11.108",                                       //8
                    "Phòng Hành chánh Tổ chức - A11.109","Phòng họp Workshop 4 - A11.505",                                                        //53
                    "Tổ Quản trị và Khai thác mạng - A11.506" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.a124))
                    }
                    "Tổ Kiến thiết Cơ bản - A11.110",                                                        //10
                    "Trung tâm dịch vụ việc làm - A11.111",                                                  //11
                    "Trung tâm dịch vụ việc làm - A11.112" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.a15))
                    }
                }
            }
        }
        //A2 Done
        when(name){
            //A2
            "Giảng đường 1 - A21.101",                                                               //55
            "Giảng đường 2 - A21.102" -> {
                arrayphong.add(Phong("Bản đồ đường đi A2",R.drawable.ra2))
                arrayphong.add(Phong("Hình ảnh tòa A2",R.drawable.a2))
                when(name){
                    "Giảng đường 1 - A21.101" -> {
                        arrayphong.add(Phong("Vị trí phòng", R.drawable.a21))
                    }
                    else -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.a22))
                    }
                }
            }
        }
        //B1 Done
        when(name){
            //B1
            //1
            "Phòng Phó Viện trưởng - Lương Hoàng Phong - Trung tâm Dịch vụ - B11.101",                //57
            "Trung tâm Đào tạo Trực tuyến từ xa - B11.102",                                          //58
            "Trung tâm Đào tạo - B11.103",                                                           //59
            "Trung tâm Phát triển Giáo dục Quốc tế - B11.104",                                       //60
            "Phòng Viện trưởng - Nguyễn Văn Nguyện - B11.105",                                       //61
            "Văn phòng Tuyển sinh - B11.106",                                                        //62
            "Phòng học Trực tuyến - Phòng họp - B11.107",                                             //63
            "Văn phòng Khoa QVT - (Quản trị Văn phòng, Việt Nam học và Thư viện) - B11.108",          //64
            "Trưởng Khoa QVT - (Quản trị Văn phòng, Việt Nam học và Thư viện) - B11.109",             //65
            "Phòng thực hành Vip - Kho - B11.110",                                                    //66
            "Bộ môn Việt Nam học - Bộ môn Quản trị Văn phòng - Thư viện - B11.111",                   //67
            "Văn phòng Đoàn Khoa QVT - (Quản trị Văn phòng, Việt Nam học và Thư viện) - B11.112",     //68
            "Phòng học Lý thuyết QVT - (Quản trị Văn phòng, Việt Nam học và Thư viện) - B11.113",     //69
            "Văn phòng Công đoàn - B11.114",                                                         //70
            "Tổ Y tế - B11.115",                                                                     //71
                //72
                //2
            "Phòng Lý thuyết TTĐTLK - (Trung tâm Đào tạo Liên kết Trà Vinh) - B11.201",               //73
            "Phòng Giám đốc TTĐTLK - Văn phòng TTĐTLK - (Trung tâm Đào tạo Liên kết Trà Vinh) - B11.202",//74
            "Phòng Lý thuyết TVU - B11.203",                                                         //75
            "Phòng Lý thuyết TTDTLK - (Trung tâm Đào tạo Liên kết Trà Vinh) - B11.204",               //76
            "Trung tâm Nghiên cứu Phát triển VPTNL - (Viện Phát triển Nguồn lực) - B11.205",          //77
            "Kho Khoa NN - (Nông nghiệp) - B11.206",                                                  //78
            "Văn phòng Khoa NN - (Nông nghiệp) - B11.207",                                            //79
            "Phó Trưởng Khoa NN - (Nông nghiệp) - Hồ Đắc Túc - B11.208",                              //80
            "Thư viện Khoa - Phòng họp - B11.209",                                                    //81
            "Trưởng Khoa - Nguyễn Thị Phương Nam - B11.210",                                         //82
            "Giảng viên 1 - B11.211",                                                                //83
            "Phòng Phó Trưởng khoa - Nguyễn Huỳnh Trang - Giảng viên 2 - B11.212",                    //84
            "Văn phòng Trung tâm HTDN - (Hỗ trợ Doanh nghiệp) - B11.213",                             //85
            "Đề án Ngoại ngữ Quốc gia 2020 - (Phòng Máy tính) - B11.214",                             //86
            "Văn phòng Trung tâm TT&QBCĐ - (Thông tin và Quảng bá Cộng đồng) - B11.215",              //87
            "Tạp chí Khoa học - B11.216",                                                            //88
            "Phòng Giám đốc Trung tâm TT&QBCĐ - (Thông tin và Quảng bá Cộng đồng) - B11.216/1",       //89
                //3
            "Phòng Lý thuyết TTĐTLK - (Trung tâm Đào tạo Liên kết Trà Vinh) - B11.301",               //90
            "Phòng Lý thuyết TVU - B11.302",                                                         //91
            "Phòng Lý thuyết CICET - (Trung tâm Hợp tác Đào tạo Quốc tế) - B11.303",                  //92
            "Văn phòng Trung tâm CICET - Giám đốc CICET - (Trung tâm Hợp tác Đào tạo Quốc tế) - B11.304",//93
            "Văn phòng Khoa Kinh tế - Luật - B11.306",                                               //94
            "Phó Khoa Kinh tế - Luật - Lê Trung Hiếu - B11.307",                                     //95
            "Phòng Lý thuyết SĐH - (Sau Đại học) - B11.308",                                          //96
            "Bộ môn Luật - B11.309",                                                                 //97
                //4
            "Phòng Lý thuyết CICET - (Trung tâm Hợp tác Đào tạo Quốc tế) - B11.401",                  //98
            "Bộ môn Hóa - Sinh - Bộ môn Tâm lý học - B11.402",                                       //99
            "Bộ môn Toán học - Bộ môn Vật lý - B11.403",                                             //100
            "Trưởng Khoa KHCB - Nguyễn Văn Sáu - (Khoa học Cơ bản) - B11.404",                        //101
            "Phòng Phó trưởng Khoa KHCB - Thi Trần Anh Tuấn - Văn phòng Khoa KHCB - (Khoa học Cơ bản) - B11.405",//102
            "Phó Trưởng Khoa LLCT - Trần Văn Bé Tư - (Lý luận Chính trị) - B11.406",                  //103
            "Phòng Lý thuyết SĐH - (Sau Đại học) - B11.407",                                          //104
            "Văn phòng Khoa LLCT - (Lý luận Chính trị) - B11.408",                                    //105
            "Phòng Lý thuyết SĐH - (Sau Đại học) - B11.409",                                          //106
            "Văn phòng Bộ môn LLCT - (Lý luận Chính trị) - B11.410",
            "B11.411",                                                                              //449
            "B11.412",
            "B11.305",                                                                              //440
            "B11.311",                                                                              //441
            "B11.312",                                                                              //442
            "B11.313",                                                                              //443
            "B11.314",                                                                              //444
            "B11.315",                                                                              //445
            "B11.316",                                                                              //446
            "B11.317",                                                                              //447
            "B11.318"                                                                              //448
            -> {
                arrayphong.add(Phong("Bản đồ đường đi B1",R.drawable.rb1))
                arrayphong.add(Phong("Hình ảnh tòa B1",R.drawable.b1))
                when(name){
                    "Phòng thực hành Vip - Kho - B11.110",                                                    //66
                    "Bộ môn Việt Nam học - Bộ môn Quản trị Văn phòng - Thư viện - B11.111",                   //67
                    "Văn phòng Đoàn Khoa QVT - (Quản trị Văn phòng, Việt Nam học và Thư viện) - B11.112",     //68
                    "Phòng học Lý thuyết QVT - (Quản trị Văn phòng, Việt Nam học và Thư viện) - B11.113",     //69
                    "Văn phòng Công đoàn - B11.114",                                                         //70
                    "Tổ Y tế - B11.115","Giảng viên 1 - B11.211",                                                                //83
                    "Phòng Phó Trưởng khoa - Nguyễn Huỳnh Trang - Giảng viên 2 - B11.212",                    //84
                    "Văn phòng Trung tâm HTDN - (Hỗ trợ Doanh nghiệp) - B11.213",                             //85
                    "Đề án Ngoại ngữ Quốc gia 2020 - (Phòng Máy tính) - B11.214",                             //86
                    "Văn phòng Trung tâm TT&QBCĐ - (Thông tin và Quảng bá Cộng đồng) - B11.215",              //87
                    "Tạp chí Khoa học - B11.216","B11.311",                                                                              //441
                    "B11.312",                                                                              //442
                    "B11.313",                                                                              //443
                    "B11.314",                                                                              //444
                    "B11.315",                                                                              //445
                    "B11.316",                                                                              //446
                    "B11.317",                                                                              //447
                    "B11.318","Phó Trưởng Khoa LLCT - Trần Văn Bé Tư - (Lý luận Chính trị) - B11.406",                  //103
                    "Phòng Lý thuyết SĐH - (Sau Đại học) - B11.407",                                          //104
                    "Văn phòng Khoa LLCT - (Lý luận Chính trị) - B11.408",                                    //105
                    "Phòng Lý thuyết SĐH - (Sau Đại học) - B11.409",                                          //106
                    "Văn phòng Bộ môn LLCT - (Lý luận Chính trị) - B11.410",
                    "B11.411",                                                                              //449
                    "B11.412" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.b11))
                    }
                    "Văn phòng Khoa QVT - (Quản trị Văn phòng, Việt Nam học và Thư viện) - B11.108",          //64
                    "Trưởng Khoa QVT - (Quản trị Văn phòng, Việt Nam học và Thư viện) - B11.109",
                    "Kho Khoa NN - (Nông nghiệp) - B11.206",                                                  //78
                    "Văn phòng Khoa NN - (Nông nghiệp) - B11.207",                                            //79
                    "Phó Trưởng Khoa NN - (Nông nghiệp) - Hồ Đắc Túc - B11.208",                              //80
                    "Thư viện Khoa - Phòng họp - B11.209",                                                    //81
                    "Trưởng Khoa - Nguyễn Thị Phương Nam - B11.210", "Văn phòng Khoa Kinh tế - Luật - B11.306",                                               //94
                    "Phó Khoa Kinh tế - Luật - Lê Trung Hiếu - B11.307",                                     //95
                    "Phòng Lý thuyết SĐH - (Sau Đại học) - B11.308",                                          //96
                    "Bộ môn Luật - B11.309", "Bộ môn Toán học - Bộ môn Vật lý - B11.403",                                             //100
                    "Trưởng Khoa KHCB - Nguyễn Văn Sáu - (Khoa học Cơ bản) - B11.404",                        //101
                    "Phòng Phó trưởng Khoa KHCB - Thi Trần Anh Tuấn - Văn phòng Khoa KHCB - (Khoa học Cơ bản) - B11.405"
                    -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.b12))
                    }//65
                    "Phòng Phó Viện trưởng - Lương Hoàng Phong - Trung tâm Dịch vụ - B11.101",                //57
                    "Trung tâm Đào tạo Trực tuyến từ xa - B11.102",                                          //58
                    "Trung tâm Đào tạo - B11.103",                                                           //59
                    "Trung tâm Phát triển Giáo dục Quốc tế - B11.104",                                       //60
                    "Phòng Viện trưởng - Nguyễn Văn Nguyện - B11.105",                                       //61
                    "Văn phòng Tuyển sinh - B11.106",                                                        //62
                    "Phòng học Trực tuyến - Phòng họp - B11.107", "Phòng Lý thuyết TTĐTLK - (Trung tâm Đào tạo Liên kết Trà Vinh) - B11.201",               //73
                    "Phòng Giám đốc TTĐTLK - Văn phòng TTĐTLK - (Trung tâm Đào tạo Liên kết Trà Vinh) - B11.202",//74
                    "Phòng Lý thuyết TVU - B11.203",                                                         //75
                    "Phòng Lý thuyết TTDTLK - (Trung tâm Đào tạo Liên kết Trà Vinh) - B11.204",               //76
                    "Trung tâm Nghiên cứu Phát triển VPTNL - (Viện Phát triển Nguồn lực) - B11.205",          //77
                    "Phòng Lý thuyết TTĐTLK - (Trung tâm Đào tạo Liên kết Trà Vinh) - B11.301",               //90
                    "Phòng Lý thuyết TVU - B11.302",                                                         //91
                    "Phòng Lý thuyết CICET - (Trung tâm Hợp tác Đào tạo Quốc tế) - B11.303",                  //92
                    "Văn phòng Trung tâm CICET - Giám đốc CICET - (Trung tâm Hợp tác Đào tạo Quốc tế) - B11.304",//93
                    "B11.305","Phòng Lý thuyết CICET - (Trung tâm Hợp tác Đào tạo Quốc tế) - B11.401",                  //98
                    "Bộ môn Hóa - Sinh - Bộ môn Tâm lý học - B11.402" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.b13))
                    }
                }
            }
        }
        //B2 Done
        when(name){
            "Phòng Lý thuyết - B21.101",                                                             //108
            "Phòng Lý thuyết - B21.102",                                                             //109
            "Phòng Lý thuyết - B21.103",                                                             //110
            "Phòng Lý thuyết - B21.104",                                                             //111
            "Phòng Lý thuyết - B21.105",                                                             //112
            "Phòng Giáo viên - Phòng Thiết bị - B21.106",                                             //113
            "Phòng Lý thuyết - B21.107",                                                             //114
                //2
            "Phòng Lý thuyết - B21.201",                                                             //115
            "Phòng Lý thuyết - B21.202",                                                             //116
            "Phòng Lý thuyết - B21.203",                                                             //117
            "Phòng Lý thuyết - B21.204",                                                             //118
            "Phòng Lý thuyết - B21.205",                                                             //119
            "Phòng Lý thuyết - B21.206",                                                             //120
            "Phòng Lý thuyết - B21.207",                                                             //121
                //3
            "Phòng Lý thuyết - B21.301",                                                             //122
            "Phòng Lý thuyết - B21.302",                                                             //123
            "Phòng Lý thuyết - B21.303",                                                             //124
            "Phòng Lý thuyết - B21.304",                                                             //125
            "Phòng Lý thuyết - B21.305",                                                             //126
            "Kho - B21.306",                                                                         //127
            "Phòng Lý thuyết - B21.307" -> {
                arrayphong.add(Phong("Bản đồ đường đi B2",R.drawable.rb2))
                arrayphong.add(Phong("Hình ảnh tòa B2",R.drawable.b2))
                when(name){
                    "Phòng Lý thuyết - B21.101",                                                             //108
                    "Phòng Lý thuyết - B21.102","Phòng Lý thuyết - B21.201",                                                             //115
                    "Phòng Lý thuyết - B21.202","Phòng Lý thuyết - B21.301",                                                             //122
                    "Phòng Lý thuyết - B21.302" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.b21))
                    }
                    "Phòng Lý thuyết - B21.103",                                                             //110
                    "Phòng Lý thuyết - B21.104",                                                             //111
                    "Phòng Lý thuyết - B21.105","Phòng Lý thuyết - B21.203",                                                             //117
                    "Phòng Lý thuyết - B21.204",                                                             //118
                    "Phòng Lý thuyết - B21.205","Phòng Lý thuyết - B21.303",                                                             //124
                    "Phòng Lý thuyết - B21.304",                                                             //125
                    "Phòng Lý thuyết - B21.305" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.b22))
                    }
                    "Phòng Giáo viên - Phòng Thiết bị - B21.106",                                             //113
                    "Phòng Lý thuyết - B21.107","Phòng Lý thuyết - B21.206",                                                             //120
                    "Phòng Lý thuyết - B21.207","Kho - B21.306",                                                                         //127
                    "Phòng Lý thuyết - B21.307" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.b23))
                    }
                }
            }
        }
        //B3 Done
        when(name){
            "Phòng Lý thuyết - B31.301",   "Phòng Lý thuyết - B31.201",  "Phòng Lý thuyết - B31.101",                                                             //129
            "Phòng Lý thuyết - B31.102",                                                           //136
            "Phòng Lý thuyết - B31.202",                                                          //143
            "Phòng Lý thuyết - B31.302",
            "Phòng Lý thuyết - B31.103",                                                             //131
            "Phòng Lý thuyết - B31.104",                                                             //132
            "Phòng Lý thuyết - B31.105",                                          //137
            "Phòng Lý thuyết - B31.203",                                                             //138
            "Phòng Lý thuyết - B31.204",                                                             //139
            "Phòng Lý thuyết - B31.205",//144
            "Phòng Lý thuyết - B31.303",                                                             //145
            "Phòng Lý thuyết - B31.304",                                                             //146
            "Phòng Lý thuyết - B31.305",
            "Phòng Lý thuyết - B31.106",                                                             //134
            "Phòng Lý thuyết - B31.107",                                            //140
            "Kho - B31.206",                                                                         //141
            "Phòng Lý thuyết - B31.207", //147
            "Phòng Lý thuyết - B31.306",                                                             //148
            "Phòng Lý thuyết - B31.307" -> {
                arrayphong.add(Phong("Bản đồ đường đi B3",R.drawable.rb3))
                arrayphong.add(Phong("Hình ảnh tòa B3",R.drawable.b3))
                when(name){
                    "Phòng Lý thuyết - B31.301",   "Phòng Lý thuyết - B31.201",  "Phòng Lý thuyết - B31.101",                                                             //129
                    "Phòng Lý thuyết - B31.102",                                                           //136
                    "Phòng Lý thuyết - B31.202",                                                          //143
                    "Phòng Lý thuyết - B31.302" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.b31))
                    }
                    "Phòng Lý thuyết - B31.105",                                          //137
                    "Phòng Lý thuyết - B31.203",                                                             //138
                    "Phòng Lý thuyết - B31.204",                                                             //139
                    "Phòng Lý thuyết - B31.205",//144
                    "Phòng Lý thuyết - B31.303",                                                             //145
                    "Phòng Lý thuyết - B31.304",                                                             //146
                    "Phòng Lý thuyết - B31.305" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.b32))
                    }
                    "Phòng Lý thuyết - B31.106",                                                             //134
                    "Phòng Lý thuyết - B31.107",                                            //140
                    "Kho - B31.206",                                                                         //141
                    "Phòng Lý thuyết - B31.207", //147
                    "Phòng Lý thuyết - B31.306",                                                             //148
                    "Phòng Lý thuyết - B31.307" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.b33))
                    }
                }
            }
        }
        //B5 Done
        when(name){
            "Phòng Thực hành Lý - Khoa KHCB - (Khoa học Cơ bản) - B51.101",                           //150
            "Phòng Lasan - (Phòng Nghiên cứu Bệnh học Thủy sản) - B51.102",                           //151
            "Phòng Vi tảo - B51.103",                                                                //152
            "Phòng Phân tích Dinh dưỡng - B51.104",                                                  //153
            "Phòng Thực hành Hóa - Khoa KHCB - (Khoa học Cơ bản) - B51.105",                          //154
            "Phòng Phó Trưởng khoa - B51.106",                                                       //155
            "Phó Trưởng khoa - B51.107",                                                             //156
            "Phòng họp - B51.108",                                                                   //157
            "Văn phòng Khoa NNTS - (Nông nghiệp Thủy sản) - B51.109",                                 //158
            "Phòng Phó Trưởng khoa - B51.110",                                                       //159
            "Giám đốc Trung Tâm CNSTH - (Công nghệ sau Thu hoạch) - B51.111",                         //160
            "Xưởng Thực nghiệm - B51.112",                                                           //161
            "Phòng Thay đồ Bảo hộ Lao động - B51.113",                                               //162
            "Hệ thống Chiên sấy - B51.114",                                                          //163
            "Phòng Lý thuyết - TT CNSTH - (Công nghệ sau Thu hoạch) - B51.115",                       //164
            "Phòng Sản xuất nước (CSP) - B51.116",                                                   //165
                //2
            "Trung tâm Phân tích Kiểm nghiệm TVU - B51.201",                                         //166
            "Phòng Thực hành Hóa Vô cơ, Hữu cơ, Hóa lý - Khoa HHUD - (Hóa học Ứng dụng) - B51.202",   //167
            "Khoa Hóa học Ứng dụng - B51.203",                                                       //168
            "Phòng Thí nghiệm - Khoa HHUD - (Hóa học Ứng dụng) - B51.204",                            //169
            "Phòng Thí nghiệm - Khoa HHUD - (Hóa học Ứng dụng) - B51.205",                            //170
            "Khoa Hóa học Ứng dụng - B51.206",                                                       //171
            "Văn phòng Trung tâm CNSTH - (Công nghệ sau Thu hoạch) - B51.207",                        //172
            "Bộ môn Thủy sản - B51.208",                                                             //173
            "Hội trưởng Khoa NNTS - (Nông nghiệp Thủy sản) - B51.209",                                //174
            "Phòng Thực hành Bộ môn Trồng trọt, Chăn nuôi Thú y - B51.210",                          //175
            "Phó Trưởng khoa NNTS - (Nông nghiệp Thủy sản) - B51.211",                                //176
            "Bộ môn Trồng trọ - Bộ môn Chăn nuôi Thú y - B51.212",                                    //177
            "Phòng Thí nghiệm Chuẩn đoán bệnh Thú y - B51.213",                                      //178
            "Phòng Thực hành hóa - Khoa KHCB - (Khoa học Cơ bản) - B51.214",                          //179
            "Phòng Thí nghiệm Vi Sinh vật học - B51.215",                                            //180
            "Phòng Thí nghiệm Sinh lý bệnh Cây trồng - B51.216",                                     //181
                //3
            "Phòng Vi sinh - B51.301",                                                               //182
            "Trung tâm Thí nghiệm (Nuôi cấy mô) - B51.302",                                          //183
            "Trung tâm Thí nghiệm (Nuôi cấy mô) - B51.303",                                          //184
            "Phòng Vô trùng - B51.304",                                                              //185
            "Phòng Vô trùng - B51.305" -> {
                arrayphong.add(Phong("Bản đồ đường đi B5",R.drawable.rb5))
                arrayphong.add(Phong("Hình ảnh tòa B5",R.drawable.b5))
                when(name){
                    "Phòng Thực hành Lý - Khoa KHCB - (Khoa học Cơ bản) - B51.101",                           //150
                    "Phòng Lasan - (Phòng Nghiên cứu Bệnh học Thủy sản) - B51.102",                           //151
                    "Phòng Vi tảo - B51.103",                                                                //152
                    "Phòng Phân tích Dinh dưỡng - B51.104",                                                  //153
                    "Phòng Thực hành Hóa - Khoa KHCB - (Khoa học Cơ bản) - B51.105",                          //154
                    "Phòng Phó Trưởng khoa - B51.106", "Trung tâm Phân tích Kiểm nghiệm TVU - B51.201",                                         //166
                    "Phòng Thực hành Hóa Vô cơ, Hữu cơ, Hóa lý - Khoa HHUD - (Hóa học Ứng dụng) - B51.202",   //167
                    "Khoa Hóa học Ứng dụng - B51.203",                                                       //168
                    "Phòng Thí nghiệm - Khoa HHUD - (Hóa học Ứng dụng) - B51.204",                            //169
                    "Phòng Thí nghiệm - Khoa HHUD - (Hóa học Ứng dụng) - B51.205",                            //170
                    "Khoa Hóa học Ứng dụng - B51.206" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.b51))
                    }
                    "Phó Trưởng khoa - B51.107",                                                             //156
                    "Phòng họp - B51.108",                                                                   //157
                    "Văn phòng Khoa NNTS - (Nông nghiệp Thủy sản) - B51.109",                                 //158
                    "Phòng Phó Trưởng khoa - B51.110","Văn phòng Trung tâm CNSTH - (Công nghệ sau Thu hoạch) - B51.207",                        //172
                    "Bộ môn Thủy sản - B51.208",                                                             //173
                    "Hội trưởng Khoa NNTS - (Nông nghiệp Thủy sản) - B51.209",                                //174
                    "Phòng Thực hành Bộ môn Trồng trọt, Chăn nuôi Thú y - B51.210","Phòng Vi sinh - B51.301",                                                               //182
                    "Trung tâm Thí nghiệm (Nuôi cấy mô) - B51.302",                                          //183
                    "Trung tâm Thí nghiệm (Nuôi cấy mô) - B51.303",                                          //184
                    "Phòng Vô trùng - B51.304",                                                              //185
                    "Phòng Vô trùng - B51.305" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.b52))
                    }
                    "Giám đốc Trung Tâm CNSTH - (Công nghệ sau Thu hoạch) - B51.111",                         //160
                    "Xưởng Thực nghiệm - B51.112",                                                           //161
                    "Phòng Thay đồ Bảo hộ Lao động - B51.113",                                               //162
                    "Hệ thống Chiên sấy - B51.114",                                                          //163
                    "Phòng Lý thuyết - TT CNSTH - (Công nghệ sau Thu hoạch) - B51.115",                       //164
                    "Phòng Sản xuất nước (CSP) - B51.116","Phó Trưởng khoa NNTS - (Nông nghiệp Thủy sản) - B51.211",                                //176
                    "Bộ môn Trồng trọ - Bộ môn Chăn nuôi Thú y - B51.212",                                    //177
                    "Phòng Thí nghiệm Chuẩn đoán bệnh Thú y - B51.213",                                      //178
                    "Phòng Thực hành hóa - Khoa KHCB - (Khoa học Cơ bản) - B51.214",                          //179
                    "Phòng Thí nghiệm Vi Sinh vật học - B51.215",                                            //180
                    "Phòng Thí nghiệm Sinh lý bệnh Cây trồng - B51.216" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.b53))
                    }
                }
            }
        }
        //B6 Done
        when(name){
            "Sảnh Nhà nghỉ Chuyên gia - B61.101",                                                    //187
            "Phòng nghỉ Bảo vệ - B61.102",                                                           //188
            "Phòng 001 - B61.103",                                                                   //189
            "Phòng 002 - B61.104",                                                                   //190
            "Phòng 003 - B61.105",                                                                   //191
                //2
            "Phòng 101 - B61.201",                                                                   //192
            "Phòng 102 - B61.202",                                                                   //193
            "Phòng 103 - B61.203",                                                                   //194
            "Phòng 104 - B61.204",                                                                   //195
            "Phòng 105 - B61.205",                                                                   //196
            "Phòng 106 - B61.206",                                                                   //197
            "Phòng 107 - B61.207",                                                                   //198
            "Phòng 108 - B61.208",                                                                   //199
                //3
            "Phòng Internet - (Nhà nghỉ Chuyên gia) - B61.301",                                       //200
            "Phòng 201 - B61.302",                                                                   //201
            "Phòng 202 - B61.303",                                                                   //202
            "Phòng 203 - B61.304",                                                                   //203
            "Phòng 204 - B61.305",
            "B61.306",
            "B61.307",
            "B61.308",
            "B61.309"-> {
                arrayphong.add(Phong("Bản đồ đường đi B6",R.drawable.rb6))
                arrayphong.add(Phong("Hình ảnh tòa B6",R.drawable.b6))
                when(name){
                    "Phòng Internet - (Nhà nghỉ Chuyên gia) - B61.301" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.b61))
                    }
                    else -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.b62))
                    }
                }
            }
        }
        //B7  Done
        when(name){
            "Hội trường - B71.101",                                                                  //205
            "Phòng Dịch vụ - B71.102",                                                               //206
            "CLB Sách và Hành động - B71.103",                                                       //207
                //2
            "Kho Quốc văn 1 - B71.201",                                                              //208
            "Phòng Phó Giám đốc - Nguyễn Vĩnh Lợi - B71.202",                                        //209
            "Phòng Nghe nhìn - B71.203",                                                             //210
            "Phòng Xử lý Tài liệu - B71.204",                                                        //211
            "Kho Quốc văn 2 - B71.205",                                                              //212
                //3
            "Kho Ngoại văn - B71.301",                                                               //213
            "Phòng Đọc báo, Tạp chí, Luận văn,... - B71.302",                                        //214
                //4
            "Phòng Máy tính 1 - B71.401",                                                            //215
            "Phòng Máy tính 2 - B71.402",                                                            //216
                //5
            "Phòng Giám đốc - Nguyễn Ngọc Tú - B71.501",                                             //217
            "Văn phòng Phòng Phó Giám đốc - Nguyễn Thị Kim Thanh - B71.502",                         //218
            "Phòng họp - B71.503",                                                                   //219
            "Phòng Kỹ thuật - B71.504",                                                              //220
            "Phòng học - B71.505",                                                                   //221
            "Phòng học - B71.506",                                                                   //222
            "Phòng học - B71.507",                                                                   //223
            "Phòng học - B71.508" -> {
                arrayphong.add(Phong("Bản đồ đường đi B7",R.drawable.rb7))
                arrayphong.add(Phong("Hình ảnh tòa B7",R.drawable.b7))
                when(name){
                    "Phòng Dịch vụ - B71.102" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.b73))
                    }
                    "Hội trường - B71.101","Kho Quốc văn 1 - B71.201",                                                              //208
                    "Phòng Phó Giám đốc - Nguyễn Vĩnh Lợi - B71.202","Phòng Đọc báo, Tạp chí, Luận văn,... - B71.302",
                    "Phòng Máy tính 1 - B71.401","Phòng Giám đốc - Nguyễn Ngọc Tú - B71.501",                                             //217
                    "Văn phòng Phòng Phó Giám đốc - Nguyễn Thị Kim Thanh - B71.502",                         //218
                    "Phòng họp - B71.503",                                                                   //219
                    "Phòng Kỹ thuật - B71.504" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.b72))
                    }
                    else -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.b71))
                    }
                }
            }
        }
        //C1 DOne
        when(name){
            "Trung tâm Đào tạo nguồn Nhân lực theo Nhu cầu Xã hội - C11.101",                        //225
            "Phòng Công nghiệp Dược - C11.102",                                                      //226
            "Bộ môn Dược - Văn phòng Khoa - C11.103",                                                 //227
            "Phòng Giáo vụ - Bộ môn Nội - C11.104",                                                   //228
            "Bộ môn Xét nghiệm - Bộ môn Giải phẫu - C11.105",                                         //229
            "Phòng Phó Trưởng khoa - C11.106",                                                       //230
            "Lãnh đạo Khoa Y - Dược - C11.107",                                                      //231
            "Bộ môn Điều dưỡng - C11.108",                                                           //232
            "Phòng Phó Khoa Y - Dược - Dương Thị Truyền - C11.109",                                  //233
                //2
            "Phòng họp Khoa - C11.201",                                                              //234
            "Liên Bộ môn Răng Hàm mặt - C11.202",                                                    //235
                                                        //236
            "Phòng Lý thuyết - C11.204",                                                             //237
            "Phòng Lý thuyết - C11.205",                                                             //238
            "Bộ môn Y học Cơ sở - C11.206",                                                          //239
            "Bộ môn Y học Dự phòng - Bộ môn Y tế Công cộng - C11.207",                                //240
            "Phòng Lý thuyết - C11.208",                                                             //241
            "Phòng trống - C11.209",                                                                 //242
                //3
            "Phòng Máy tính Thực hành - C11.301",                                                    //243
            "Phòng Máy tính Thực hành - C11.302",                                                    //244
            "Quỹ học bổng - C11.303",  "Văn phòng Đoàn hội Khoa Y - Dược - C11.203",                                                  //245
            "Phòng Máy tính Thực hành - C11.304",                                                    //246
            "Phòng Máy tính Thực hành - C11.305",                                                    //247
            "Phòng Máy tính Thực hành - C11.306",                                                    //248
            "Phòng Máy tính Thực hành - C11.307",                                                    //249
            "Phòng Máy tính Thực hành - C11.308",                                                    //250
            "Phòng Máy tính Thực hành - C11.309",                                                    //251
            "Phòng Máy tính Thực hành - C11.310",                                                    //252
            "Phòng Máy tính Thực hành - C11.311",                                                    //253
            "Phòng Máy tính Thực hành - C11.312",                                                    //254
            "Tổ Máy tính Thực hành - C11.313",                                                       //255
                //4
            "Phòng Thực hành Điều dưỡng Cơ sở - C11.401",                                            //256
            "Phòng Thực hành tiền Lâm sàng 1 - C11.402",                                             //257
            "Phòng Thực hành tiền Lâm sàng 2 - C11.403",                                             //258
            "Phòng thực hành Thăm khám Nội nhi - C11.404",                                           //269
            "Phòng Thực hành Thăm khám Ngoại - C11.405",                                             //260
            "Phòng Thực hành Thăm khám Sản - C11.406",                                               //261
            "Phòng Thực hành Mô phôi - C11.407",                                                     //262
            "Phòng Thi hài 1 - C11.408",                                                             //263
            "Phòng Thi hài 2 - C11.409",                                                             //264
            "Phòng Thực hành Giải phẫu - C11.410",                                                   //265
            "Văn phòng Bộ môn Huấn luyện Kỹ năng - C11.411",                                         //266
                //5
            "Phòng trống - C11.501",                                                                 //267
            "Phòng trống - C11.502" -> {
                arrayphong.add(Phong("Bản đồ đường đi C1",R.drawable.rc1))
                arrayphong.add(Phong("Hình ảnh tòa C1",R.drawable.c1))
                when(name){
                    "Phòng Công nghiệp Dược - C11.102","Quỹ học bổng - C11.303",  "Văn phòng Đoàn hội Khoa Y - Dược - C11.203"
                        -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.c14))
                    }
                    "Trung tâm Đào tạo nguồn Nhân lực theo Nhu cầu Xã hội - C11.101","Phòng họp Khoa - C11.201",                                                              //234
                    "Liên Bộ môn Răng Hàm mặt - C11.202","Phòng Máy tính Thực hành - C11.301",                                                    //243
                    "Phòng Máy tính Thực hành - C11.302","Phòng Thực hành Điều dưỡng Cơ sở - C11.401",
                    "Phòng trống - C11.501",                                                                 //267
                    "Phòng trống - C11.502" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.c11))
                    }
                    "Phòng Phó Trưởng khoa - C11.106",                                                       //230
                    "Lãnh đạo Khoa Y - Dược - C11.107",                                                      //231
                    "Bộ môn Điều dưỡng - C11.108",                                                           //232
                    "Phòng Phó Khoa Y - Dược - Dương Thị Truyền - C11.109","Phòng Lý thuyết - C11.208",
                    "Phòng Máy tính Thực hành - C11.310",                                                    //252
                    "Phòng Máy tính Thực hành - C11.311",                                                    //253
                    "Phòng Máy tính Thực hành - C11.312",                                                    //254
                    "Tổ Máy tính Thực hành - C11.313",
                    "Phòng Thi hài 1 - C11.408",                                                             //263
                    "Phòng Thi hài 2 - C11.409",                                                             //264
                    "Phòng Thực hành Giải phẫu - C11.410",                                                   //265
                    "Văn phòng Bộ môn Huấn luyện Kỹ năng - C11.411" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.c12))
                    }
                    else -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.c13))
                    }
                }
            }
        }
        //C2 Done
        when(name){
            "Thực hành Đo lường Điện - C21.101",                                                     //269
            "Thực hành Trang bị Điện - C21.102",                                                     //270
            "Kho - C21.103",                                                                         //271
            "Thực hành Máy điện - C21.104",                                                          //272
            "Thực hành Dân dụng - Công nghiệp - C21.105",                                            //273
                //2
            "Thực hành Công nghệ Tự động hóa - C21.201",                                             //274
            "Văn phòng Bộ môn Điện - C21.202",                                                       //275
            "Phòng Thí nghiệm Máy điện - C21.203",                                                   //276
            "Phòng Tiến Sĩ Thạch Lễ Khiêm - C21.204" -> {
                arrayphong.add(Phong("Bản đồ đường đi C2",R.drawable.rc2))
                arrayphong.add(Phong("Hình ảnh tòa C2",R.drawable.c2))
                when(name){
                    "Thực hành Đo lường Điện - C21.101",                                                     //269
                    "Thực hành Trang bị Điện - C21.102",                                                     //270
                    "Phòng Tiến Sĩ Thạch Lễ Khiêm - C21.204"-> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.c92))
                    }
                    else -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.c91))
                    }
                }
            }
        }
        //C3 Done
        when(name){
            "Phòng Thực hành CAD/CAM/CNC - C31.101",                                                 //278
            "Thực hành Điện lạnh - C31.102",                                                         //279
            "Kho Lưới điện - C31.103",                                                               //280
            "Xưởng Thực hành Tiện - C31.104",                                                        //281
            "Phòng Lý thuyết - C31.105",                                                             //282
                //2
            "N/A - C31.201",                                                                         //283
            "Phòng Thực hành Điện tử Công Suất - Hệ thống Điện - C31.202",                            //284
            "Phòng Chuyên đề - C31.203",                                                             //285
            "Phòng Thực hành Điện khí Nén - Biến tần - C31.204",                                     //286
            "Trưởng Bộ môn - C31.205" -> {
                arrayphong.add(Phong("Bản đồ đường đi C3",R.drawable.rc3))
                arrayphong.add(Phong("Hình ảnh tòa C3",R.drawable.c3))
                when(name){
                    "Phòng Thực hành CAD/CAM/CNC - C31.101",                                                 //278
                    "Thực hành Điện lạnh - C31.102",                                                         //279
                    "N/A - C31.201","Phòng Thực hành Điện khí Nén - Biến tần - C31.204",                                     //286
                    "Trưởng Bộ môn - C31.205"-> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.c92))
                    }
                    else -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.c91))
                    }
                }
            }
        }
        //C4 Done
        when(name){
            "Thực hành Điện ô tô 1 - C41.101",                                                       //288
            "Xưởng Thực hành Điện ô tô - C41.102",                                                   //289
            "Kho Dụng cụ - C41.103",                                                                 //290
            "Xưởng Thực hành Động cơ - C41.104",                                                     //291
            "Kho vật tư - C41.105",                                                                  //292
            "Xưởng Thực hành Hàn - C41.106",                                                         //293
            "Xưởng Thực hành Nguội - C41.107",                                                       //294
            "Xưởng Thực hành Xe Gắn máy - C41.108",                                                  //295
                //2
            "Kho - C41.201",                                                                         //296
            "Phòng Lý thuyết - C41.202",                                                             //297
            "Phòng Lý thuyết - C41.203",                                                             //298
            "Phòng Giáo viên - C41.204",                                                             //299
            "Phòng 2 (Máy tính) - C41.205",                                                          //300
            "Phòng 1 (Máy tính - C41.206",                                                           //301
            "Văn phòng Tổ Bộ môn - C41.207" -> {
                arrayphong.add(Phong("Bản đồ đường đi C4",R.drawable.rc4))
                arrayphong.add(Phong("Hình ảnh tòa C4",R.drawable.c4))
                when(name){
                    "Phòng Lý thuyết - C41.202",                                                             //297
                    "Phòng Lý thuyết - C41.203" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.c412))
                    }
                    "Thực hành Điện ô tô 1 - C41.101",                                                       //288
                    "Xưởng Thực hành Điện ô tô - C41.102",                                                   //289
                    "Kho Dụng cụ - C41.103" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.c424))
                    }
                    else -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.c434))
                    }
                }
            }
        }
        //C5 Done
        when(name){
            "Phòng Giáo vụ - C51.101",                                                               //303
            "Văn Phòng Khoa Kỹ thuật Công nghệ - C51.102",                                           //304
            "Phòng Công đoàn - C51.103",                                                             //305
            "Phòng Thực hành Đo lương và Điều khiển Máy tính - C51.104",                             //306
            "Phòng Phó Trưởng khoa - C51.105",                                                       //307
            "Phòng Phó Trưởng khoa - C51.106",                                                       //308
                //2
            "Phòng họp - C51.201",                                                                   //309
            "Hội trường Khoa Kỹ thuật Công nghệ - C51.202",                                          //310
            "Phòng Trưởng Khoa - C51.203" -> {
                arrayphong.add(Phong("Bản đồ đường đi C5",R.drawable.rc5))
                arrayphong.add(Phong("Hình ảnh tòa C5",R.drawable.c5))
                when(name){
                    "Phòng Công đoàn - C51.103",                                                             //305
                    "Phòng Thực hành Đo lương và Điều khiển Máy tính - C51.104" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.c51))
                    }
                    "Phòng Giáo vụ - C51.101" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.c53))
                    }
                    "Hội trường Khoa Kỹ thuật Công nghệ - C51.202" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.c534))
                    }
                    else -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.c52))
                    }
                }
            }                                                           //311
        }
        //C6 Done
        when(name){
            "Trung tâm Hộ trợ Phát triển Dạy và Học - C61.101",                                      //312
            "Trung tâm Hộ trợ Phát triển Dạy và Học - C61.102" -> {
                arrayphong.add(Phong("Bản đồ đường đi C6",R.drawable.rc6))
                arrayphong.add(Phong("Hình ảnh tòa C6",R.drawable.c6))
                arrayphong.add(Phong("Vị trí phòng",R.drawable.d4_))
            }
        }
        //C7 Done
        when(name){
            "Bộ môn Thiết kế Công nghệ - C71.101",                                                   //314
            "CLB Tin học - C71.102",                                                                 //315
            "Phòng Máy tính Thực hành - C71.103",                                                    //316
            "Phòng Máy tính Thực hành - C71.104",                                                    //317
            "Phòng Máy tính Thực hành - C71.105",                                                    //318
            "Phòng Máy tính Thực hành - C71.106",                                                    //319
            "N/A - C71.107",                                                                         //320
                //2
            "Văn phòng Bộ môn CNTT - (Công nghệ Thông tin) - C71.201",                                //321
            "Phòng Nghiên cứu CNTT - (Công nghệ Thông tin) - C71.202",                                //322
            "Phòng Nghiên cứu CNTT - (Công nghệ Thông tin) - C71.203",                                //323
            "Phòng Máy tính Thực hành - C71.204",                                                    //324
            "Phòng Lab - C71.205" -> {
                arrayphong.add(Phong("bản đồ đường đi C7",R.drawable.rc7))
                arrayphong.add(Phong("Hình ảnh tòa C7",R.drawable.c7))
                when(name){
                    "Bộ môn Thiết kế Công nghệ - C71.101",                                                   //314
                    "CLB Tin học - C71.102","Văn phòng Bộ môn CNTT - (Công nghệ Thông tin) - C71.201" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.c92))
                    }
                    else -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.c91))
                    }
                }
            }
        }
        //C8  Done
        when(name){
            "Phòng Thí nghiệm Vật liệu Xây dựng - C81.101",                                          //326
            "Bộ môn Xây dựng - C81.102",                                                             //327
            "Kho Thiết bị - C81.103",                                                                //328
                //2
            "Phòng Tin học Ứng dụng - C81.201",                                                      //329
            "Phòng Thực hành - C81.202",                                                             //330
            "Phòng Lý thuyết - C81.203",                                                             //331
            "Phó Trưởng Bộ môn Xây dựng - C81.204",                                                  //332
            "Phòng trống - C81.205" -> {
                arrayphong.add(Phong("Bản đồ đường đi C8",R.drawable.rc8))
                arrayphong.add(Phong("Hình ảnh tòa C8",R.drawable.c8))
                when(name){
                    "Phòng Thí nghiệm Vật liệu Xây dựng - C81.101",                                          //326
                    "Bộ môn Xây dựng - C81.102","Phó Trưởng Bộ môn Xây dựng - C81.204" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.c92))
                    }
                    else -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.c91))
                    }
                }
            }
        }
        //C9 Done
        when(name){
            "Kho Vật tư - C91.101",                                                                  //334
            "N/A - C91.102",                                                                         //335
            "Phòng Thực hành Vi Xử lý - C91.103",                                                    //336
            "Phòng Thực hành Truyền Số liệu - C91.104",                                              //337
            "Văn phòng Bộ môn - C91.105",                                                            //338
            "Phòng Thực hành Kỹ thuật Âm thanh - C91.106",                                           //339
            "Phòng Thực hành Đo lường Cảm biến - C91.107",                                           //340
                ///2
            "Phòng Thực hành Điện tử Công suất - C91.201",                                           //341
            "N/A - C91.202",                                                                         //342
            "Phòng Thực hành Kỹ thuật Số - C91.203",                                                 //343
            "Phòng Thực hành Tổng đài Điện tử - C91.204",                                            //344
            "PHòng Thực hành Thông tin Quang - C91.205",                                             //345
            "PHòng Thực hành Đo lường Điện - C91.206",                                               //346
            "Phòng Thực hành Kỹ thuật Hình ảnh - C91.207" -> {
                arrayphong.add(Phong("Bản đồ đường đi C9",R.drawable.rc9))
                arrayphong.add(Phong("Hình ảnh tòa C9",R.drawable.c9))
                when(name){
                    "Kho Vật tư - C91.101",                                                                  //334
                    "N/A - C91.102","PHòng Thực hành Thông tin Quang - C91.205",                                             //345
                    "PHòng Thực hành Đo lường Điện - C91.206",                                               //346
                    "Phòng Thực hành Kỹ thuật Hình ảnh - C91.207" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.c91))
                    }
                    else -> {
                        arrayphong.add(Phong("Vị trí phòng", R.drawable.c92))
                    }
                }
            }
        }
        //D3 Done
        when(name){
            "Phòng Lý thuyết - D31.101",                                                             //348
            "Phòng Lý thuyết - D31.102",                                                             //349
            "Phòng Lý thuyết - D31.103",                                                             //350
            "Phòng Lý thuyết - D31.104",                                                             //351
            "Phòng Lý thuyết - D31.105",                                                             //352
            "Phòng Lý thuyết - D31.106",                                                             //353
            "Phòng Lý thuyết - D31.107",                                                             //354
            "Phòng Lý thuyết - D31.108" -> {
                arrayphong.add(Phong("Bản đồ đường đi D3",R.drawable.rc3))
                arrayphong.add(Phong("Hình ảnh tòa D3",R.drawable.d3))
                arrayphong.add(Phong("Vị trí phòng",R.drawable.d4_))
            }
        }
        //D4 Done
        when(name){
            "Hội trường Giáo dục Quốc phòng - D41.101",                                              //356
            "Phòng Giáo viên - D41.102",                                                             //357
            "Phòng Hành chính Tổng hợp - Đào tạo Quản lý Học viên - D41.103",                         //358
            "Phòng Phó Giám đốc - D41.104",                                                          //359
            "Kho - D41.105" -> {
                arrayphong.add(Phong("Bản đồ đường đi D4",R.drawable.rd4))
                arrayphong.add(Phong("Hình ảnh tòa D4",R.drawable.d4))
                arrayphong.add(Phong("Vị trí phòng",R.drawable.d4_))
            }
        }
        //D5 Done
        when(name){
            "D51.101",                                                                              //361
            "D51.102",                                                                              //362

            "D51.203",                                                                              //363
            "D51.204",                                                                              //364
            "D51.205",                                                                              //365
            "D51.206" -> {
                arrayphong.add(Phong("Bản đồ đường đi D5",R.drawable.rd5))
                arrayphong.add(Phong("Hình ảnh tòa D5",R.drawable.d5))
                when(name){
                    "D51.101","D51.203",                                                                              //363
                    "D51.204" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.d51))
                    }
                    else -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.d52))
                    }
                }
            }
        }
        //D6 Done
        when(name){
            "Phòng Lý thuyết - D61.101",                                                             //371
            "Phòng Lý thuyết - D61.102",                                                             //372
            "Phòng Lý thuyết - D61.103",                                                             //373
            "Phòng Lý thuyết - D61.104",                                                             //374
            "Phòng Thiết bị - D61.105",                                                              //375
            "Phòng Lý thuyết - D61.106",                                                             //376
            "Phòng Lý thuyết - D61.107",                                                             //377
            "Phòng Lý thuyết - D61.108",                                                             //378
                //2
            "Phòng Lý thuyết - D61.201",                                                             //379
            "Phòng Lý thuyết - D61.202",                                                             //380
            "Phòng Lý thuyết - D61.203",                                                             //381
            "Phòng Lý thuyết - D61.204",                                                             //382
            "Văn phòng Đào Khoa Sư phạm - D61.205",                                                  //383
            "Phòng Lý thuyết - D61.206",                                                             //384
            "Phòng Lý thuyết - D61.207",                                                             //385
            "Phòng Lý thuyết - D61.208",                                                             //386
                //3
            "Phòng Tập giảng Mầm non - D61.301",                                                     //387
            "Phòng Tập giảng Tiểu học - D61.302",                                                    //388
            "Phòng Tạo hình Mầm non - D61.303",                                                      //389
            "Phòng Phó Trưởng Khoa Sư phạm - D61.304",                                               //390
            "Phòng Phó Trưởng Khoa Sư Phạm - D61.305",                                               //391
            "Phòng Trưởng Khoa Sư phạm - D61.306",                                                   //392
            "Văn phòng Khoa Sư phạm - D61.307",                                                      //393
            "Bộ môn Sư phạm Mầm non - D61.308",                                                      //394
            "Kho - D61.309",                                                                         //395
            "Bộ môn Tiểu học - D61.310" -> {
                arrayphong.add(Phong("Bản đồ đường đi D6",R.drawable.rd6))
                arrayphong.add(Phong("Hình ảnh tòa D6",R.drawable.d6))
                when(name){
                    "Phòng Lý thuyết - D61.101",                                                             //371
                    "Phòng Lý thuyết - D61.102","Phòng Lý thuyết - D61.201",                                                             //379
                    "Phòng Lý thuyết - D61.202","Phòng Tập giảng Mầm non - D61.301",                                                     //387
                    "Phòng Tập giảng Tiểu học - D61.302" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.d63))
                    }
                    "Phòng Lý thuyết - D61.103",                                                             //373
                    "Phòng Lý thuyết - D61.104", "Phòng Lý thuyết - D61.203",                                                             //381
                    "Phòng Lý thuyết - D61.204","Phòng Tạo hình Mầm non - D61.303",                                                      //389
                    "Phòng Phó Trưởng Khoa Sư phạm - D61.304" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.d62))
                    }
                    else -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.d62))
                    }
                }
            }
        }
        //D7 Done
        when(name){
            "Phòng Máy tính Thực hành - D71.101",                                                    //399
            "D71.102",                                                                              //400
            "Phòng Máy tính Thực hành - D71.103",                                                    //401
            "Phòng Máy tính Thực hành - D71.104",                                                    //402
            "Phòng Máy tính Thực hành - D71.105",                                                    //403
            "Phòng Máy tính Thực hành - D71.106",                                                    //404
            "Phòng Máy tính Thực hành - D71.107",                                                    //405
            "Phòng Máy tính Thực hành - D71.108",                                                    //406
            "Phòng Máy tính Thực hành - D71.109",                                                    //407
            "Phòng Máy tính Thực hành - D71.110",                                                    //408
            "Phòng Máy tính Thực hành - D71.111",                                                    //409
            "Phòng Máy tính Thực hành - D71.112",                                                    //410
            "Phòng Máy tính Thực hành - D71.113",                                                    //411
            "Phòng Máy tính Thực hành - D71.114",                                                    //412
            "D71.115",                                                                              //413
            "D71.116",                                                                              //414
            "D71.117" -> {
                arrayphong.add(Phong("Bản đồ đường đi D7",R.drawable.rd7))
                arrayphong.add(Phong("Hình ảnh tòa D7",R.drawable.d7))
                when(name){
                    "Phòng Máy tính Thực hành - D71.101" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.d72))
                    }
                    "D71.102","D71.115",                                                                              //413
                    "D71.116",                                                                              //414
                    "D71.117" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.d74))
                    }
                    "Phòng Máy tính Thực hành - D71.103",                                                    //401
                    "Phòng Máy tính Thực hành - D71.104",                                                    //402
                    "Phòng Máy tính Thực hành - D71.105",                                                    //403
                    "Phòng Máy tính Thực hành - D71.106",                                                    //404
                    "Phòng Máy tính Thực hành - D71.107",                                                    //405
                    "Phòng Máy tính Thực hành - D71.108" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.d71))
                    }
                    else -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.d73))
                    }
                }
            }
        }
        //D8 Done
        when(name){
            "D81.101",                                                                              //416
            "D81.102",                                                                              //417
            "D81.103",                                                                              //418
            "D81.104",                                                                              //419
            "D81.105",                                                                              //420
            "D81.106",                                                                              //421
            "D81.107",                                                                              //422
            "D81.108",                                                                              //423
            "D81.109",                                                                              //424
            "D81.110",                                                                              //425
            "D81.111",                                                                              //426
            "D81.112",                                                                              //427
            "D81.113",                                                                              //428
            "D81.114",                                                                              //429
            "D81.115",                                                                              //430
            "D81.116",                                                                              //431
            "D81.117",                                                                              //432
            "K12",                                                                                  //433
            "K13",                                                                                  //434
            "K14",                                                                                  //435
            "K15" -> {
                arrayphong.add(Phong("Bản đồ đường đi D8",R.drawable.rd8))
                arrayphong.add(Phong("Hình ảnh tòa D8",R.drawable.d8))
                when(name){
                    "K12",                                                                                  //433
                    "K13",                                                                                  //434
                    "K14",                                                                                  //435
                    "K15" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.d83))
                    }
                    "D81.109",                                                                              //424
                    "D81.110",                                                                              //425
                    "D81.111",                                                                              //426
                    "D81.112",                                                                              //427
                    "D81.113",                                                                              //428
                    "D81.114",                                                                              //429
                    "D81.115",                                                                              //430
                    "D81.116",                                                                              //431
                    "D81.117" -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.d82))
                    }
                    else -> {
                        arrayphong.add(Phong("Vị trí phòng",R.drawable.d81))
                    }
                }
            }
        }
        listview.adapter = CustomAdapter(this@Activity_phong,arrayphong)
    }
}
