import org.jetbrains.annotations.NotNull;

import java.util.logging.*;

class RecruitmentSolution {
    public static void main(String[] args) {
        final String recordType = "Vacancy";

        Record softwareEngineerVacancy = new Record("SoftwareEngineer0001", recordType);
        Record frontEndEngineerVacancy = new Record("FrontEndEngineer0020", recordType);
        Service.setStatusSubmitForApproval(softwareEngineerVacancy);
        Service.setStatusApproved(softwareEngineerVacancy);
        Service.setStatusSubmitForApproval(frontEndEngineerVacancy);
        Service.setStatusRejected(frontEndEngineerVacancy);

        /*
         * Implement a logic of actions and invoke those actions below:
         */

        // Invoke "Submit for Approval" for softwareEngineerVacancy
        // Invoke "Approve" for softwareEngineerVacancy

        // Invoke "Submit for Approval" for frontEndEngineerVacancy
        // Invoke "Reject" for frontEndEngineerVacancy
    }




    /*
     * Implement the service below the comment block

    */

    class Service {
        private static final Logger LOGGER = Logger.getLogger(Service.class.getName());

        public static void setStatusSubmitForApproval(@NotNull Record record){
            record.type = "Submitted for Approval";
            LOGGER.log(Level.INFO,"Submitted for approval Vacancy: {0}", record.id);

        }
        public static void setStatusApproved(@NotNull Record record){
            record.type = "Approved";
            LOGGER.log(Level.INFO,"Approved record: {0}", record.id);

        }
        public static void setStatusRejected(@NotNull Record record){
            record.type = "Rejected";
            LOGGER.log(Level.INFO,"Rejected record: {0}", record.id);

        }

    }

    static class Record {
        private String id;
        private String type;

        Record(String id, String type) {
            this.id = id;
            this.type = type;
        }

        public String getId() {
            return this.id;
        }

        public String getType() {
            return this.type;
        }
    }
}
