import com.sap.gateway.ip.core.customdev.util.Message

def Message processData(Message message) {
    exposeLoopCounterPropertyOnMonitorMessage(message)
    return message
}

def exposeLoopCounterPropertyOnMonitorMessage(Message message) {
    def messageLog = messageLogFactory.getMessageLog(message)
    if(messageLog){
        def loopCounter = message.getProperty("CamelSplitSize") as String
        if (loopCounter) {
            messageLogFactory
                .getMessageLog(message)
                .addCustomHeaderProperty("loopCounter", loopCounter)
        }
    }
}