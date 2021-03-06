/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/CreateListener"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateListenerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     */
    private String loadBalancerArn;
    /**
     * <p>
     * The protocol for connections from clients to the load balancer. For Application Load Balancers, the supported
     * protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS, UDP, and TCP_UDP.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The port on which the load balancer is listening.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers are supported. The
     * following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-2016-08</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-TLS-1-0-2015-04</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-TLS-1-1-2017-01</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-TLS-1-2-2017-01</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-TLS-1-2-Ext-2018-06</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-FS-2018-06</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-FS-1-1-2019-08</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-FS-1-2-2019-08</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-FS-1-2-Res-2019-08</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies"
     * >Security Policies</a> in the <i>Application Load Balancers Guide</i> and <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#describe-ssl-policies"
     * >Security Policies</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     */
    private String sslPolicy;
    /**
     * <p>
     * [HTTPS and TLS listeners] The default certificate for the listener. You must provide exactly one certificate. Set
     * <code>CertificateArn</code> to the certificate ARN but do not set <code>IsDefault</code>.
     * </p>
     * <p>
     * To create a certificate list for the listener, use <a>AddListenerCertificates</a>.
     * </p>
     */
    private java.util.List<Certificate> certificates;
    /**
     * <p>
     * The actions for the default rule.
     * </p>
     */
    private java.util.List<Action> defaultActions;
    /**
     * <p>
     * [TLS listeners] The name of the Application-Layer Protocol Negotiation (ALPN) policy. You can specify one policy
     * name. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HTTP1Only</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Only</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Optional</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Preferred</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>None</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#alpn-policies"
     * >ALPN Policies</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     */
    private java.util.List<String> alpnPolicy;
    /**
     * <p>
     * The tags to assign to the listener.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * 
     * @param loadBalancerArn
     *        The Amazon Resource Name (ARN) of the load balancer.
     */

    public void setLoadBalancerArn(String loadBalancerArn) {
        this.loadBalancerArn = loadBalancerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the load balancer.
     */

    public String getLoadBalancerArn() {
        return this.loadBalancerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * 
     * @param loadBalancerArn
     *        The Amazon Resource Name (ARN) of the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest withLoadBalancerArn(String loadBalancerArn) {
        setLoadBalancerArn(loadBalancerArn);
        return this;
    }

    /**
     * <p>
     * The protocol for connections from clients to the load balancer. For Application Load Balancers, the supported
     * protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS, UDP, and TCP_UDP.
     * </p>
     * 
     * @param protocol
     *        The protocol for connections from clients to the load balancer. For Application Load Balancers, the
     *        supported protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS,
     *        UDP, and TCP_UDP.
     * @see ProtocolEnum
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol for connections from clients to the load balancer. For Application Load Balancers, the supported
     * protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS, UDP, and TCP_UDP.
     * </p>
     * 
     * @return The protocol for connections from clients to the load balancer. For Application Load Balancers, the
     *         supported protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS,
     *         UDP, and TCP_UDP.
     * @see ProtocolEnum
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol for connections from clients to the load balancer. For Application Load Balancers, the supported
     * protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS, UDP, and TCP_UDP.
     * </p>
     * 
     * @param protocol
     *        The protocol for connections from clients to the load balancer. For Application Load Balancers, the
     *        supported protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS,
     *        UDP, and TCP_UDP.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolEnum
     */

    public CreateListenerRequest withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol for connections from clients to the load balancer. For Application Load Balancers, the supported
     * protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS, UDP, and TCP_UDP.
     * </p>
     * 
     * @param protocol
     *        The protocol for connections from clients to the load balancer. For Application Load Balancers, the
     *        supported protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS,
     *        UDP, and TCP_UDP.
     * @see ProtocolEnum
     */

    public void setProtocol(ProtocolEnum protocol) {
        withProtocol(protocol);
    }

    /**
     * <p>
     * The protocol for connections from clients to the load balancer. For Application Load Balancers, the supported
     * protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS, UDP, and TCP_UDP.
     * </p>
     * 
     * @param protocol
     *        The protocol for connections from clients to the load balancer. For Application Load Balancers, the
     *        supported protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS,
     *        UDP, and TCP_UDP.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolEnum
     */

    public CreateListenerRequest withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The port on which the load balancer is listening.
     * </p>
     * 
     * @param port
     *        The port on which the load balancer is listening.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port on which the load balancer is listening.
     * </p>
     * 
     * @return The port on which the load balancer is listening.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port on which the load balancer is listening.
     * </p>
     * 
     * @param port
     *        The port on which the load balancer is listening.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers are supported. The
     * following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-2016-08</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-TLS-1-0-2015-04</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-TLS-1-1-2017-01</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-TLS-1-2-2017-01</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-TLS-1-2-Ext-2018-06</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-FS-2018-06</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-FS-1-1-2019-08</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-FS-1-2-2019-08</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-FS-1-2-Res-2019-08</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies"
     * >Security Policies</a> in the <i>Application Load Balancers Guide</i> and <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#describe-ssl-policies"
     * >Security Policies</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * 
     * @param sslPolicy
     *        [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers are supported. The
     *        following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ELBSecurityPolicy-2016-08</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ELBSecurityPolicy-TLS-1-0-2015-04</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ELBSecurityPolicy-TLS-1-1-2017-01</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ELBSecurityPolicy-TLS-1-2-2017-01</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ELBSecurityPolicy-TLS-1-2-Ext-2018-06</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ELBSecurityPolicy-FS-2018-06</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ELBSecurityPolicy-FS-1-1-2019-08</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ELBSecurityPolicy-FS-1-2-2019-08</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ELBSecurityPolicy-FS-1-2-Res-2019-08</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies"
     *        >Security Policies</a> in the <i>Application Load Balancers Guide</i> and <a href=
     *        "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#describe-ssl-policies"
     *        >Security Policies</a> in the <i>Network Load Balancers Guide</i>.
     */

    public void setSslPolicy(String sslPolicy) {
        this.sslPolicy = sslPolicy;
    }

    /**
     * <p>
     * [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers are supported. The
     * following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-2016-08</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-TLS-1-0-2015-04</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-TLS-1-1-2017-01</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-TLS-1-2-2017-01</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-TLS-1-2-Ext-2018-06</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-FS-2018-06</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-FS-1-1-2019-08</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-FS-1-2-2019-08</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-FS-1-2-Res-2019-08</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies"
     * >Security Policies</a> in the <i>Application Load Balancers Guide</i> and <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#describe-ssl-policies"
     * >Security Policies</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * 
     * @return [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers are supported. The
     *         following are the possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ELBSecurityPolicy-2016-08</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ELBSecurityPolicy-TLS-1-0-2015-04</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ELBSecurityPolicy-TLS-1-1-2017-01</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ELBSecurityPolicy-TLS-1-2-2017-01</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ELBSecurityPolicy-TLS-1-2-Ext-2018-06</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ELBSecurityPolicy-FS-2018-06</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ELBSecurityPolicy-FS-1-1-2019-08</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ELBSecurityPolicy-FS-1-2-2019-08</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ELBSecurityPolicy-FS-1-2-Res-2019-08</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies"
     *         >Security Policies</a> in the <i>Application Load Balancers Guide</i> and <a href=
     *         "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#describe-ssl-policies"
     *         >Security Policies</a> in the <i>Network Load Balancers Guide</i>.
     */

    public String getSslPolicy() {
        return this.sslPolicy;
    }

    /**
     * <p>
     * [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers are supported. The
     * following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-2016-08</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-TLS-1-0-2015-04</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-TLS-1-1-2017-01</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-TLS-1-2-2017-01</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-TLS-1-2-Ext-2018-06</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-FS-2018-06</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-FS-1-1-2019-08</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-FS-1-2-2019-08</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELBSecurityPolicy-FS-1-2-Res-2019-08</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies"
     * >Security Policies</a> in the <i>Application Load Balancers Guide</i> and <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#describe-ssl-policies"
     * >Security Policies</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * 
     * @param sslPolicy
     *        [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers are supported. The
     *        following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ELBSecurityPolicy-2016-08</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ELBSecurityPolicy-TLS-1-0-2015-04</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ELBSecurityPolicy-TLS-1-1-2017-01</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ELBSecurityPolicy-TLS-1-2-2017-01</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ELBSecurityPolicy-TLS-1-2-Ext-2018-06</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ELBSecurityPolicy-FS-2018-06</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ELBSecurityPolicy-FS-1-1-2019-08</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ELBSecurityPolicy-FS-1-2-2019-08</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ELBSecurityPolicy-FS-1-2-Res-2019-08</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies"
     *        >Security Policies</a> in the <i>Application Load Balancers Guide</i> and <a href=
     *        "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#describe-ssl-policies"
     *        >Security Policies</a> in the <i>Network Load Balancers Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest withSslPolicy(String sslPolicy) {
        setSslPolicy(sslPolicy);
        return this;
    }

    /**
     * <p>
     * [HTTPS and TLS listeners] The default certificate for the listener. You must provide exactly one certificate. Set
     * <code>CertificateArn</code> to the certificate ARN but do not set <code>IsDefault</code>.
     * </p>
     * <p>
     * To create a certificate list for the listener, use <a>AddListenerCertificates</a>.
     * </p>
     * 
     * @return [HTTPS and TLS listeners] The default certificate for the listener. You must provide exactly one
     *         certificate. Set <code>CertificateArn</code> to the certificate ARN but do not set <code>IsDefault</code>
     *         .</p>
     *         <p>
     *         To create a certificate list for the listener, use <a>AddListenerCertificates</a>.
     */

    public java.util.List<Certificate> getCertificates() {
        return certificates;
    }

    /**
     * <p>
     * [HTTPS and TLS listeners] The default certificate for the listener. You must provide exactly one certificate. Set
     * <code>CertificateArn</code> to the certificate ARN but do not set <code>IsDefault</code>.
     * </p>
     * <p>
     * To create a certificate list for the listener, use <a>AddListenerCertificates</a>.
     * </p>
     * 
     * @param certificates
     *        [HTTPS and TLS listeners] The default certificate for the listener. You must provide exactly one
     *        certificate. Set <code>CertificateArn</code> to the certificate ARN but do not set <code>IsDefault</code>
     *        .</p>
     *        <p>
     *        To create a certificate list for the listener, use <a>AddListenerCertificates</a>.
     */

    public void setCertificates(java.util.Collection<Certificate> certificates) {
        if (certificates == null) {
            this.certificates = null;
            return;
        }

        this.certificates = new java.util.ArrayList<Certificate>(certificates);
    }

    /**
     * <p>
     * [HTTPS and TLS listeners] The default certificate for the listener. You must provide exactly one certificate. Set
     * <code>CertificateArn</code> to the certificate ARN but do not set <code>IsDefault</code>.
     * </p>
     * <p>
     * To create a certificate list for the listener, use <a>AddListenerCertificates</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificates(java.util.Collection)} or {@link #withCertificates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param certificates
     *        [HTTPS and TLS listeners] The default certificate for the listener. You must provide exactly one
     *        certificate. Set <code>CertificateArn</code> to the certificate ARN but do not set <code>IsDefault</code>
     *        .</p>
     *        <p>
     *        To create a certificate list for the listener, use <a>AddListenerCertificates</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest withCertificates(Certificate... certificates) {
        if (this.certificates == null) {
            setCertificates(new java.util.ArrayList<Certificate>(certificates.length));
        }
        for (Certificate ele : certificates) {
            this.certificates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * [HTTPS and TLS listeners] The default certificate for the listener. You must provide exactly one certificate. Set
     * <code>CertificateArn</code> to the certificate ARN but do not set <code>IsDefault</code>.
     * </p>
     * <p>
     * To create a certificate list for the listener, use <a>AddListenerCertificates</a>.
     * </p>
     * 
     * @param certificates
     *        [HTTPS and TLS listeners] The default certificate for the listener. You must provide exactly one
     *        certificate. Set <code>CertificateArn</code> to the certificate ARN but do not set <code>IsDefault</code>
     *        .</p>
     *        <p>
     *        To create a certificate list for the listener, use <a>AddListenerCertificates</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest withCertificates(java.util.Collection<Certificate> certificates) {
        setCertificates(certificates);
        return this;
    }

    /**
     * <p>
     * The actions for the default rule.
     * </p>
     * 
     * @return The actions for the default rule.
     */

    public java.util.List<Action> getDefaultActions() {
        return defaultActions;
    }

    /**
     * <p>
     * The actions for the default rule.
     * </p>
     * 
     * @param defaultActions
     *        The actions for the default rule.
     */

    public void setDefaultActions(java.util.Collection<Action> defaultActions) {
        if (defaultActions == null) {
            this.defaultActions = null;
            return;
        }

        this.defaultActions = new java.util.ArrayList<Action>(defaultActions);
    }

    /**
     * <p>
     * The actions for the default rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDefaultActions(java.util.Collection)} or {@link #withDefaultActions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param defaultActions
     *        The actions for the default rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest withDefaultActions(Action... defaultActions) {
        if (this.defaultActions == null) {
            setDefaultActions(new java.util.ArrayList<Action>(defaultActions.length));
        }
        for (Action ele : defaultActions) {
            this.defaultActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions for the default rule.
     * </p>
     * 
     * @param defaultActions
     *        The actions for the default rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest withDefaultActions(java.util.Collection<Action> defaultActions) {
        setDefaultActions(defaultActions);
        return this;
    }

    /**
     * <p>
     * [TLS listeners] The name of the Application-Layer Protocol Negotiation (ALPN) policy. You can specify one policy
     * name. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HTTP1Only</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Only</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Optional</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Preferred</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>None</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#alpn-policies"
     * >ALPN Policies</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * 
     * @return [TLS listeners] The name of the Application-Layer Protocol Negotiation (ALPN) policy. You can specify one
     *         policy name. The following are the possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>HTTP1Only</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HTTP2Only</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HTTP2Optional</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HTTP2Preferred</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>None</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#alpn-policies"
     *         >ALPN Policies</a> in the <i>Network Load Balancers Guide</i>.
     */

    public java.util.List<String> getAlpnPolicy() {
        return alpnPolicy;
    }

    /**
     * <p>
     * [TLS listeners] The name of the Application-Layer Protocol Negotiation (ALPN) policy. You can specify one policy
     * name. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HTTP1Only</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Only</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Optional</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Preferred</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>None</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#alpn-policies"
     * >ALPN Policies</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * 
     * @param alpnPolicy
     *        [TLS listeners] The name of the Application-Layer Protocol Negotiation (ALPN) policy. You can specify one
     *        policy name. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HTTP1Only</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HTTP2Only</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HTTP2Optional</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HTTP2Preferred</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>None</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#alpn-policies"
     *        >ALPN Policies</a> in the <i>Network Load Balancers Guide</i>.
     */

    public void setAlpnPolicy(java.util.Collection<String> alpnPolicy) {
        if (alpnPolicy == null) {
            this.alpnPolicy = null;
            return;
        }

        this.alpnPolicy = new java.util.ArrayList<String>(alpnPolicy);
    }

    /**
     * <p>
     * [TLS listeners] The name of the Application-Layer Protocol Negotiation (ALPN) policy. You can specify one policy
     * name. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HTTP1Only</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Only</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Optional</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Preferred</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>None</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#alpn-policies"
     * >ALPN Policies</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlpnPolicy(java.util.Collection)} or {@link #withAlpnPolicy(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param alpnPolicy
     *        [TLS listeners] The name of the Application-Layer Protocol Negotiation (ALPN) policy. You can specify one
     *        policy name. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HTTP1Only</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HTTP2Only</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HTTP2Optional</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HTTP2Preferred</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>None</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#alpn-policies"
     *        >ALPN Policies</a> in the <i>Network Load Balancers Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest withAlpnPolicy(String... alpnPolicy) {
        if (this.alpnPolicy == null) {
            setAlpnPolicy(new java.util.ArrayList<String>(alpnPolicy.length));
        }
        for (String ele : alpnPolicy) {
            this.alpnPolicy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * [TLS listeners] The name of the Application-Layer Protocol Negotiation (ALPN) policy. You can specify one policy
     * name. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HTTP1Only</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Only</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Optional</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HTTP2Preferred</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>None</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#alpn-policies"
     * >ALPN Policies</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * 
     * @param alpnPolicy
     *        [TLS listeners] The name of the Application-Layer Protocol Negotiation (ALPN) policy. You can specify one
     *        policy name. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HTTP1Only</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HTTP2Only</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HTTP2Optional</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HTTP2Preferred</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>None</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#alpn-policies"
     *        >ALPN Policies</a> in the <i>Network Load Balancers Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest withAlpnPolicy(java.util.Collection<String> alpnPolicy) {
        setAlpnPolicy(alpnPolicy);
        return this;
    }

    /**
     * <p>
     * The tags to assign to the listener.
     * </p>
     * 
     * @return The tags to assign to the listener.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to assign to the listener.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the listener.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to assign to the listener.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to assign to the listener.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLoadBalancerArn() != null)
            sb.append("LoadBalancerArn: ").append(getLoadBalancerArn()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getSslPolicy() != null)
            sb.append("SslPolicy: ").append(getSslPolicy()).append(",");
        if (getCertificates() != null)
            sb.append("Certificates: ").append(getCertificates()).append(",");
        if (getDefaultActions() != null)
            sb.append("DefaultActions: ").append(getDefaultActions()).append(",");
        if (getAlpnPolicy() != null)
            sb.append("AlpnPolicy: ").append(getAlpnPolicy()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateListenerRequest == false)
            return false;
        CreateListenerRequest other = (CreateListenerRequest) obj;
        if (other.getLoadBalancerArn() == null ^ this.getLoadBalancerArn() == null)
            return false;
        if (other.getLoadBalancerArn() != null && other.getLoadBalancerArn().equals(this.getLoadBalancerArn()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getSslPolicy() == null ^ this.getSslPolicy() == null)
            return false;
        if (other.getSslPolicy() != null && other.getSslPolicy().equals(this.getSslPolicy()) == false)
            return false;
        if (other.getCertificates() == null ^ this.getCertificates() == null)
            return false;
        if (other.getCertificates() != null && other.getCertificates().equals(this.getCertificates()) == false)
            return false;
        if (other.getDefaultActions() == null ^ this.getDefaultActions() == null)
            return false;
        if (other.getDefaultActions() != null && other.getDefaultActions().equals(this.getDefaultActions()) == false)
            return false;
        if (other.getAlpnPolicy() == null ^ this.getAlpnPolicy() == null)
            return false;
        if (other.getAlpnPolicy() != null && other.getAlpnPolicy().equals(this.getAlpnPolicy()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancerArn() == null) ? 0 : getLoadBalancerArn().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getSslPolicy() == null) ? 0 : getSslPolicy().hashCode());
        hashCode = prime * hashCode + ((getCertificates() == null) ? 0 : getCertificates().hashCode());
        hashCode = prime * hashCode + ((getDefaultActions() == null) ? 0 : getDefaultActions().hashCode());
        hashCode = prime * hashCode + ((getAlpnPolicy() == null) ? 0 : getAlpnPolicy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateListenerRequest clone() {
        return (CreateListenerRequest) super.clone();
    }

}
