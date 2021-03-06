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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateVoiceConnectorGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVoiceConnectorGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The updated Amazon Chime Voice Connector group details.
     * </p>
     */
    private VoiceConnectorGroup voiceConnectorGroup;

    /**
     * <p>
     * The updated Amazon Chime Voice Connector group details.
     * </p>
     * 
     * @param voiceConnectorGroup
     *        The updated Amazon Chime Voice Connector group details.
     */

    public void setVoiceConnectorGroup(VoiceConnectorGroup voiceConnectorGroup) {
        this.voiceConnectorGroup = voiceConnectorGroup;
    }

    /**
     * <p>
     * The updated Amazon Chime Voice Connector group details.
     * </p>
     * 
     * @return The updated Amazon Chime Voice Connector group details.
     */

    public VoiceConnectorGroup getVoiceConnectorGroup() {
        return this.voiceConnectorGroup;
    }

    /**
     * <p>
     * The updated Amazon Chime Voice Connector group details.
     * </p>
     * 
     * @param voiceConnectorGroup
     *        The updated Amazon Chime Voice Connector group details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVoiceConnectorGroupResult withVoiceConnectorGroup(VoiceConnectorGroup voiceConnectorGroup) {
        setVoiceConnectorGroup(voiceConnectorGroup);
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
        if (getVoiceConnectorGroup() != null)
            sb.append("VoiceConnectorGroup: ").append(getVoiceConnectorGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVoiceConnectorGroupResult == false)
            return false;
        UpdateVoiceConnectorGroupResult other = (UpdateVoiceConnectorGroupResult) obj;
        if (other.getVoiceConnectorGroup() == null ^ this.getVoiceConnectorGroup() == null)
            return false;
        if (other.getVoiceConnectorGroup() != null && other.getVoiceConnectorGroup().equals(this.getVoiceConnectorGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceConnectorGroup() == null) ? 0 : getVoiceConnectorGroup().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVoiceConnectorGroupResult clone() {
        try {
            return (UpdateVoiceConnectorGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
