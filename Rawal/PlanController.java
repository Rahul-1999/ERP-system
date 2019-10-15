
// plan controller handler

class PlanController {

    PlanService planService;
    private static final Logger LOGGER = LoggerFactory.getLogger(PlanController.class);
    
    public PlanController(PlanService planService) {
        super();
        this.planService = planService;
    }

    public PlanController() {

    }

    public void setPlanService(PlanService planService) {
        this.planService = planService;
    }
    

        if (null != plan.getDateTravel()) {

            plan.setDateTravel(new java.sql.Date(plan.getDateTravel().getTime()));
            // plan.setDateTravel(new java.sql.Date(new Date().getTime()));
        } 
        else {

            plan.setDateTravel(new java.sql.Date(new Date().getTime()));
        }
        plan.setDateAdded(new java.sql.Date(new Date().getTime()));
        return planService.addPlan(plan);
    }


class PlanService{

}

class Logger{
    
}
class LoggerFactory{ 
    void getLogger() { 
        
    }
}
class plan{ 
    boolean getDateTravel(){ 
        return true;
    }
   void setDateTravel(){ 
        
   }
}

