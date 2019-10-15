
class SendEmailController {

    EmailService emailService;

    public SendEmailController(EmailService emailService) {
        super();
        this.emailService = emailService;
        // this.planService = planService;

    }

    public SendEmailController() {

    }


        String mail = plan.getEmailId();
        List<Plan> list = new ArrayList<Plan>();
        List<Integer> listId = plan.getIdList();
        System.out.println("list**" + listId.size());
        System.out.println(mail);
        StringBuffer body = new StringBuffer();
        User user = userService.findOne(plan.getUserId());
        System.out.println(plan.getUserId());
        for (Integer planList : listId) {
            list.add(planService.getPlansByPlaceId(planList));
        }
         List<Plan> list = planService.getPlansById(plan.getUserId());
        System.out.println("List" + list.size());


          for(Plan planDetails:list){

       

        String subject = "Your Plan Confirmation";

        return emailService.sendEmail(mail, subject, body.toString());
    }

    public void setServices(PlanService planService, UserService userService, EmailService emailService) {
        this.emailService = emailService;
        this.planService = planService;
        this.userService = userService;
    }

    public List<Plan> constructEmail(Plan plan) {

        return null;
    }

}