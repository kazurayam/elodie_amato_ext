import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

ResponseObject response = WS.sendRequest((RequestObject)findTestObject('Stock-A25-XML-CAT - tuned')) // (1)
WS.verifyResponseStatusCode(response, 200)                  
WS.comment(response.getResponseText().toString())
WS.verifyElementText(response, 'quote_A2.ErrorHead.ErrorCode', '1')             
WS.verifyElementText(response, 'quote_A2.DocumentID', 'A2')          