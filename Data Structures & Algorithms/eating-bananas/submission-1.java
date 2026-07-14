class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        
        // Tìm tốc độ ăn tối đa (bằng nải chuối lớn nhất)
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        
        // Bắt đầu Binary Search
        while (left < right) {
            int mid = left + (right - left) / 2; // Tốc độ ăn thử nghiệm
            long totalTime = 0;
            
            // Tính tổng thời gian nếu ăn với tốc độ 'mid'
            for (int pile : piles) {
                totalTime += Math.ceil((double) pile / mid);
            }
            
            // Nếu thời gian ăn <= h, tức là Koko ăn kịp
            if (totalTime <= h) {
                // Tốc độ này ổn, nhưng Koko muốn ăn chậm nhất có thể
                // Nên ta thử tìm tiếp xem có tốc độ nào chậm hơn (nhỏ hơn) mà vẫn kịp không
                right = mid; 
            } else {
                // Nếu totalTime > h, tức là Koko ăn quá chậm, không kịp giờ
                // Bắt buộc phải tăng tốc độ lên
                left = mid + 1; 
            }
        }
        
        return left;
    }
}