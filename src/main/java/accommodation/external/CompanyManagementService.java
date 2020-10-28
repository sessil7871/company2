
package accommodation.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

//@FeignClient(name="Room", url="http://Room:8080")
@FeignClient(name="Room", url="${api.room.url}")
public interface CompanyManagementService {

    @RequestMapping(method= RequestMethod.POST, path="/companyManagements")
    public void companyCancelConfirm(@RequestBody CompanyManagement companyManagement);

}