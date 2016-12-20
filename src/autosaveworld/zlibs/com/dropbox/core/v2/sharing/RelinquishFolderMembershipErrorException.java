/* DO NOT EDIT */
/* This file was generated by Stone */

package autosaveworld.zlibs.com.dropbox.core.v2.sharing;

import autosaveworld.zlibs.com.dropbox.core.DbxApiException;
import autosaveworld.zlibs.com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link
 * RelinquishFolderMembershipError} error.
 *
 * <p> This exception is raised by {@link
 * DbxUserSharingRequests#relinquishFolderMembership(String,boolean)}. </p>
 */
public class RelinquishFolderMembershipErrorException extends DbxApiException {
    // exception for routes:
    //     2/sharing/relinquish_folder_membership

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link
     * DbxUserSharingRequests#relinquishFolderMembership(String,boolean)}.
     */
    public final RelinquishFolderMembershipError errorValue;

    public RelinquishFolderMembershipErrorException(String routeName, String requestId, LocalizedText userMessage, RelinquishFolderMembershipError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}