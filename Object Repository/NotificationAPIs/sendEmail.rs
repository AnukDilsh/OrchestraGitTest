<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>sendEmail</name>
   <tag></tag>
   <elementGuidId>2cc57767-04cc-4c7e-8b81-b4102a6eadea</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;attachCalendar\&quot;: false,\n  \&quot;attachQrCode\&quot;: false,\n  \&quot;calendarContentJson\&quot;: \&quot;string\&quot;,\n  \&quot;emailBody\&quot;: \&quot;string\&quot;,\n  \&quot;fromEmail\&quot;: \&quot;anukdilshan@gmail.com\&quot;,\n  \&quot;notAfter\&quot;: \&quot;2018-09-17T07:23:16.232Z\&quot;,\n  \&quot;notBefore\&quot;: \&quot;2018-09-17T07:23:16.232Z\&quot;,\n  \&quot;qrCodes\&quot;: [\n    \&quot;string\&quot;\n  ],\n  \&quot;subject\&quot;: \&quot;string\&quot;,\n  \&quot;tenant\&quot;: \&quot;string\&quot;,\n  \&quot;toEmail\&quot;: \&quot;anukdilshan@gmail.com\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://34.241.228.116/notification/email?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
