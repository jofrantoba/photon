//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.12 at 07:25:26 PM PDT 
//


package org.smpte_ra.schemas.st2067_2_2020;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.smpte_ra.schemas.st2067_2_2016.BaseResourceType;
import org.smpte_ra.schemas.st2067_2_2016.TrackFileResourceType;


/**
 * <p>Java class for StereoImageTrackFileResourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StereoImageTrackFileResourceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.smpte-ra.org/schemas/2067-3/2016}BaseResourceType">
 *       &lt;sequence>
 *         &lt;element name="LeftEye" type="{http://www.smpte-ra.org/schemas/2067-3/2016}TrackFileResourceType"/>
 *         &lt;element name="RightEye" type="{http://www.smpte-ra.org/schemas/2067-3/2016}TrackFileResourceType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StereoImageTrackFileResourceType", propOrder = {
    "leftEye",
    "rightEye"
})
public class StereoImageTrackFileResourceType
    extends BaseResourceType
{

    @XmlElement(name = "LeftEye", required = true)
    protected TrackFileResourceType leftEye;
    @XmlElement(name = "RightEye", required = true)
    protected TrackFileResourceType rightEye;

    /**
     * Gets the value of the leftEye property.
     * 
     * @return
     *     possible object is
     *     {@link TrackFileResourceType }
     *     
     */
    public TrackFileResourceType getLeftEye() {
        return leftEye;
    }

    /**
     * Sets the value of the leftEye property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackFileResourceType }
     *     
     */
    public void setLeftEye(TrackFileResourceType value) {
        this.leftEye = value;
    }

    /**
     * Gets the value of the rightEye property.
     * 
     * @return
     *     possible object is
     *     {@link TrackFileResourceType }
     *     
     */
    public TrackFileResourceType getRightEye() {
        return rightEye;
    }

    /**
     * Sets the value of the rightEye property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackFileResourceType }
     *     
     */
    public void setRightEye(TrackFileResourceType value) {
        this.rightEye = value;
    }

}