Các bước thực hiện bài tập

B1. Đọc nội dung gồm cấu trúc dữ liệu anh đã tạo sẵn trong dự án lesson12-data-model

B2. Tạo dự án mới
+ Đặt tên: lesson12-hoten
+ Xóa package thừa trong src/test/java
+ Copy package allocation và dependency trong file pom.xml sang lesson12-hoten
<dependencies>
	<dependency>
		<groupId>org.apache.commons</groupId>
		<artifactId>commons-lang3</artifactId>
		<version>3.10</version>
	</dependency>
<dependencies>
** Tuyệt đối không được code trực tiếp trên project lesson12-data-model

B3. Đọc yêu cầu trong file 12. BT.pdf thực hiện tính toán gồm 4 bước áp dụng những thứ đã học như stream, collection.
    Đọc dữ liệu kiểm tra cách thực hiện trong file 12. BT - Example.xlsx
    
B4. Làm bài
............................

Input: Danh sách cửa hàng
       Số lượng phân phối từ warehouse - nhà kho
Kết quả trả về: Map<K, V>
+ K: Cửa hàng nào >> store id
+ V: Bao nhiêu mặt hàng >> store allocated amount