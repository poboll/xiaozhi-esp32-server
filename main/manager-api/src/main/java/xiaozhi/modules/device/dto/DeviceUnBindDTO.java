package xiaozhi.modules.device.dto;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serializable;

/**
 * 设备解绑表单
 */
@Data
@Schema(description = "设备解绑表单")
public class DeviceUnBindDTO implements Serializable {

    @Schema(description = "设备ID")
    @NotBlank(message = "设备ID不能为空")
    private Long deviceId;

}