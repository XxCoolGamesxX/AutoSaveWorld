/* DO NOT EDIT */
/* This file was generated from sharing_files.stone */

package autosaveworld.zlibs.com.dropbox.core.v2.sharing;

import java.io.IOException;
import java.util.Arrays;

import autosaveworld.zlibs.com.dropbox.core.stone.StoneSerializers;
import autosaveworld.zlibs.com.dropbox.core.stone.UnionSerializer;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonGenerationException;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonGenerator;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonParseException;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonParser;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonToken;

/**
 * Errors for {@link
 * DbxUserSharingRequests#addFileMember(String,java.util.List)}.
 *
 * <p> This class is an open tagged union.  Tagged unions instances are always
 * associated to a specific tag.  This means only one of the {@code isAbc()}
 * methods will return {@code true}. You can use {@link #tag()} to determine the
 * tag associated with this instance. </p>
 *
 * <p> Open unions may be extended in the future with additional tags. If a new
 * tag is introduced that this SDK does not recognized, the {@link #OTHER} value
 * will be used. </p>
 */
public final class AddFileMemberError {
    // union sharing.AddFileMemberError (sharing_files.stone)

    /**
     * Discriminating tag type for {@link AddFileMemberError}.
     */
    public enum Tag {
        USER_ERROR, // SharingUserError
        ACCESS_ERROR, // SharingFileAccessError
        /**
         * The user has reached the rate limit for invitations.
         */
        RATE_LIMIT,
        /**
         * The custom message did not pass comment permissions checks.
         */
        INVALID_COMMENT,
        /**
         * Catch-all used for unknown tag values returned by the Dropbox
         * servers.
         *
         * <p> Receiving a catch-all value typically indicates this SDK version
         * is not up to date. Consider updating your SDK version to handle the
         * new tags. </p>
         */
        OTHER; // *catch_all
    }

    /**
     * The user has reached the rate limit for invitations.
     */
    public static final AddFileMemberError RATE_LIMIT = new AddFileMemberError(Tag.RATE_LIMIT, null, null);
    /**
     * The custom message did not pass comment permissions checks.
     */
    public static final AddFileMemberError INVALID_COMMENT = new AddFileMemberError(Tag.INVALID_COMMENT, null, null);
    /**
     * Catch-all used for unknown tag values returned by the Dropbox servers.
     *
     * <p> Receiving a catch-all value typically indicates this SDK version is
     * not up to date. Consider updating your SDK version to handle the new
     * tags. </p>
     */
    public static final AddFileMemberError OTHER = new AddFileMemberError(Tag.OTHER, null, null);

    private final Tag _tag;
    private final SharingUserError userErrorValue;
    private final SharingFileAccessError accessErrorValue;

    /**
     * Errors for {@link
     * DbxUserSharingRequests#addFileMember(String,java.util.List)}.
     *
     * @param userErrorValue  Must not be {@code null}.
     * @param accessErrorValue  Must not be {@code null}.
     * @param _tag  Discriminating tag for this instance.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    private AddFileMemberError(Tag _tag, SharingUserError userErrorValue, SharingFileAccessError accessErrorValue) {
        this._tag = _tag;
        this.userErrorValue = userErrorValue;
        this.accessErrorValue = accessErrorValue;
    }

    /**
     * Returns the tag for this instance.
     *
     * <p> This class is a tagged union.  Tagged unions instances are always
     * associated to a specific tag.  This means only one of the {@code isXyz()}
     * methods will return {@code true}. Callers are recommended to use the tag
     * value in a {@code switch} statement to properly handle the different
     * values for this {@code AddFileMemberError}. </p>
     *
     * <p> If a tag returned by the server is unrecognized by this SDK, the
     * {@link Tag#OTHER} value will be used. </p>
     *
     * @return the tag for this instance.
     */
    public Tag tag() {
        return _tag;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link Tag#USER_ERROR},
     * {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#USER_ERROR}, {@code false} otherwise.
     */
    public boolean isUserError() {
        return this._tag == Tag.USER_ERROR;
    }

    /**
     * Returns an instance of {@code AddFileMemberError} that has its tag set to
     * {@link Tag#USER_ERROR}.
     *
     * <p> None </p>
     *
     * @param value  value to assign to this instance.
     *
     * @return Instance of {@code AddFileMemberError} with its tag set to {@link
     *     Tag#USER_ERROR}.
     *
     * @throws IllegalArgumentException  if {@code value} is {@code null}.
     */
    public static AddFileMemberError userError(SharingUserError value) {
        if (value == null) {
            throw new IllegalArgumentException("Value is null");
        }
        return new AddFileMemberError(Tag.USER_ERROR, value, null);
    }

    /**
     * This instance must be tagged as {@link Tag#USER_ERROR}.
     *
     * @return The {@link SharingUserError} value associated with this instance
     *     if {@link #isUserError} is {@code true}.
     *
     * @throws IllegalStateException  If {@link #isUserError} is {@code false}.
     */
    public SharingUserError getUserErrorValue() {
        if (this._tag != Tag.USER_ERROR) {
            throw new IllegalStateException("Invalid tag: required Tag.USER_ERROR, but was Tag." + this._tag.name());
        }
        return userErrorValue;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#ACCESS_ERROR}, {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#ACCESS_ERROR}, {@code false} otherwise.
     */
    public boolean isAccessError() {
        return this._tag == Tag.ACCESS_ERROR;
    }

    /**
     * Returns an instance of {@code AddFileMemberError} that has its tag set to
     * {@link Tag#ACCESS_ERROR}.
     *
     * <p> None </p>
     *
     * @param value  value to assign to this instance.
     *
     * @return Instance of {@code AddFileMemberError} with its tag set to {@link
     *     Tag#ACCESS_ERROR}.
     *
     * @throws IllegalArgumentException  if {@code value} is {@code null}.
     */
    public static AddFileMemberError accessError(SharingFileAccessError value) {
        if (value == null) {
            throw new IllegalArgumentException("Value is null");
        }
        return new AddFileMemberError(Tag.ACCESS_ERROR, null, value);
    }

    /**
     * This instance must be tagged as {@link Tag#ACCESS_ERROR}.
     *
     * @return The {@link SharingFileAccessError} value associated with this
     *     instance if {@link #isAccessError} is {@code true}.
     *
     * @throws IllegalStateException  If {@link #isAccessError} is {@code
     *     false}.
     */
    public SharingFileAccessError getAccessErrorValue() {
        if (this._tag != Tag.ACCESS_ERROR) {
            throw new IllegalStateException("Invalid tag: required Tag.ACCESS_ERROR, but was Tag." + this._tag.name());
        }
        return accessErrorValue;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link Tag#RATE_LIMIT},
     * {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#RATE_LIMIT}, {@code false} otherwise.
     */
    public boolean isRateLimit() {
        return this._tag == Tag.RATE_LIMIT;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#INVALID_COMMENT}, {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#INVALID_COMMENT}, {@code false} otherwise.
     */
    public boolean isInvalidComment() {
        return this._tag == Tag.INVALID_COMMENT;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link Tag#OTHER},
     * {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link Tag#OTHER},
     *     {@code false} otherwise.
     */
    public boolean isOther() {
        return this._tag == Tag.OTHER;
    }

    @Override
    public int hashCode() {
        int hash = Arrays.hashCode(new Object [] {
            _tag,
            userErrorValue,
            accessErrorValue
        });
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        else if (obj instanceof AddFileMemberError) {
            AddFileMemberError other = (AddFileMemberError) obj;
            if (this._tag != other._tag) {
                return false;
            }
            switch (_tag) {
                case USER_ERROR:
                    return (this.userErrorValue == other.userErrorValue) || (this.userErrorValue.equals(other.userErrorValue));
                case ACCESS_ERROR:
                    return (this.accessErrorValue == other.accessErrorValue) || (this.accessErrorValue.equals(other.accessErrorValue));
                case RATE_LIMIT:
                    return true;
                case INVALID_COMMENT:
                    return true;
                case OTHER:
                    return true;
                default:
                    return false;
            }
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return Serializer.INSTANCE.serialize(this, false);
    }

    /**
     * Returns a String representation of this object formatted for easier
     * readability.
     *
     * <p> The returned String may contain newlines. </p>
     *
     * @return Formatted, multiline String representation of this object
     */
    public String toStringMultiline() {
        return Serializer.INSTANCE.serialize(this, true);
    }

    /**
     * For internal use only.
     */
    static class Serializer extends UnionSerializer<AddFileMemberError> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(AddFileMemberError value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value.tag()) {
                case USER_ERROR: {
                    g.writeStartObject();
                    writeTag("user_error", g);
                    g.writeFieldName("user_error");
                    SharingUserError.Serializer.INSTANCE.serialize(value.userErrorValue, g);
                    g.writeEndObject();
                    break;
                }
                case ACCESS_ERROR: {
                    g.writeStartObject();
                    writeTag("access_error", g);
                    g.writeFieldName("access_error");
                    SharingFileAccessError.Serializer.INSTANCE.serialize(value.accessErrorValue, g);
                    g.writeEndObject();
                    break;
                }
                case RATE_LIMIT: {
                    g.writeString("rate_limit");
                    break;
                }
                case INVALID_COMMENT: {
                    g.writeString("invalid_comment");
                    break;
                }
                default: {
                    g.writeString("other");
                }
            }
        }

        @Override
        public AddFileMemberError deserialize(JsonParser p) throws IOException, JsonParseException {
            AddFileMemberError value;
            boolean collapsed;
            String tag;
            if (p.getCurrentToken() == JsonToken.VALUE_STRING) {
                collapsed = true;
                tag = getStringValue(p);
                p.nextToken();
            }
            else {
                collapsed = false;
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                throw new JsonParseException(p, "Required field missing: " + TAG_FIELD);
            }
            else if ("user_error".equals(tag)) {
                SharingUserError fieldValue = null;
                expectField("user_error", p);
                fieldValue = SharingUserError.Serializer.INSTANCE.deserialize(p);
                value = AddFileMemberError.userError(fieldValue);
            }
            else if ("access_error".equals(tag)) {
                SharingFileAccessError fieldValue = null;
                expectField("access_error", p);
                fieldValue = SharingFileAccessError.Serializer.INSTANCE.deserialize(p);
                value = AddFileMemberError.accessError(fieldValue);
            }
            else if ("rate_limit".equals(tag)) {
                value = AddFileMemberError.RATE_LIMIT;
            }
            else if ("invalid_comment".equals(tag)) {
                value = AddFileMemberError.INVALID_COMMENT;
            }
            else {
                value = AddFileMemberError.OTHER;
                skipFields(p);
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}