package accommodation;

import accommodation.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PolicyHandler{
    @Autowired
    CompanyRepository companyRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void onStringEventListener(@Payload String eventString){

    }
    /*
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCompayCanced_StatusUpdate(@Payload CompayCanced compayCanced) {

        if (compayCanced.isMe()) {
            Optional<Company> companyOptional = companyRepository.findById(compayCanced.getId());
            Company company = companyOptional.get();
            company.setCompanyStatus("regReject");

            companyRepository.save(company);
//            System.out.println("##### listener UpdateStatus : " + shipped.toJson());
            System.out.println("##### listener compayCanced StatusUpdate : " + compayCanced.toJson());
        }
    }
    */
    /*
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCompayRegisted_StatusUpdate(@Payload CompayRegisted compayRegisted) {

            if (compayRegisted.isMe()) {
                Optional<Company> companyOptional = companyRepository.findById(compayRegisted.getId());
                Company company = companyOptional.get();
                company.setCompanyStatus("registFinish");
                companyRepository.save(company);
                System.out.println("##### listener compayRegisted UpdateStatus : " + compayRegisted.toJson());
        }
    }

     */
}
