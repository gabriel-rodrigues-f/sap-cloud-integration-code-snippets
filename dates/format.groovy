import com.sap.gateway.ip.core.customdev.util.Message
import java.text.SimpleDateFormat

def Message processData(Message message) {
    message.setBody(new SimpleDateFormat('yyyy-MM-dd HH:mm:ss.S').format(new Date()))
    return message
}
