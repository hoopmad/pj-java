package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        // 영화 리뷰 정보 선언
        // 영화 인스턴스 선언
        MovieReview inception = new MovieReview();
        inception.title = "Inception";
        inception.review = "Life is an endless loop.";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "About Time";
        aboutTime.review = "No. 1 time movie!";

        MovieReview[] movieReviews = {inception, aboutTime};

        // 영화 리뷰 정보 출력
        for (MovieReview mr : movieReviews) {
            System.out.println("영화 제목: " + mr.title + ", 리뷰: " + mr.review);
        }
    }
}
