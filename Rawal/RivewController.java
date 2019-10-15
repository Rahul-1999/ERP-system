
//RivewController

class ReviewController {

    ReviewService reviewService;


    public ReviewController(ReviewService reviewService) {
        super();
        this.reviewService = reviewService;
    }

    public ReviewController() {
    }

    public void setReviewService(ReviewService service) {
        this.reviewService = service;
    }

        review.setDateAdded(new java.sql.Date(new Date().getTime()));
        return reviewService.addReview(review);
    }


        return reviewService.getReviewsByPlace(review.getPlace());
    }

}

