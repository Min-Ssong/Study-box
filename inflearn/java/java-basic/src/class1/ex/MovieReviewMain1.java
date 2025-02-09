package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "insepstion";
        movieReview1.review = "life is infinite loop";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "about time";
        movieReview2.review = "life time movie!";

        MovieReview[] movieReviews = {movieReview1, movieReview2};
        for (MovieReview movieReview : movieReviews) {
            System.out.println("movie title : " + movieReview.title + ", review : " + movieReview.review);
        }
    }
}
