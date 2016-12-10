package main.java.model;

/**
 * Holds the file data that is the same for all files
 * @author Alexander Hennie-Roed
 * @version 1.0.0
 */
public class FileDataHolder {
    /*
      Here is the proper layout of different parts of the file:

      Header: header1 + quizName + header2 + startDate + header3 + endDate + header4
      MC Question: mc1 + question + mc2 + mcra1 + responseA + mcra2 + mcrb1 + responseB
          + mcrb2 + mcrc1 + responseC + mcrc2 + mcrd1 + responseD + mcrd2 + mc3 + mcra3
          + AisCorrect + mcra4 + mcrb3 + BisCorrect + mcrb4 + mcrc3 + CisCorrect + mcrc4
          + mcrd3 + DisCorrect + mcrd4 + mc4
      TF Question: tf1 + question + tf2
      ES Question: es1 + question + es2
      Ending: end

      Manifest: mfst1 + fileName + mfst2

      Note: The questions are numbered based on their order in the file.
     */
    //Header string variables
    private final String header1 = "<questestinterop>\n" +
            "  <assessment ident=\"102506\" title=\"";
    private final String header2 = "\">\n" +
            "    <qticomment></qticomment>\n" +
            "    <duration></duration>\n" +
            "    <qtimetadata>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>AUTHORS</fieldlabel>\n" +
            "        <fieldentry>ea9c86e67c61f31e479d318ab1e5e6af</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "     <qtimetadatafield>\n" +
            "        <fieldlabel>CREATOR</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>SHOW_CREATOR</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>SCALENAME</fieldlabel>\n" +
            "        <fieldentry>STRONGLY_AGREE</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_AUTHORS</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_DESCRIPTION</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "       <qtimetadatafield>\n" +
            "        <fieldlabel>ATTACHMENT</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>DISPLAY_TEMPLATE</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "       <qtimetadatafield>\n" +
            "        <fieldlabel>START_DATE</fieldlabel>\n" +
            "        <fieldentry>";
    private final String header3 = "</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>END_DATE</fieldlabel>\n" +
            "        <fieldentry>";
    private final String header4 = "</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>RETRACT_DATE</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "      <fieldlabel>CONSIDER_START_DATE</fieldlabel>\n" +
            "        <fieldentry>False</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>CONSIDER_END_DATE</fieldlabel>\n" +
            "        <fieldentry>False</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>CONSIDER_RETRACT_DATE</fieldlabel>\n" +
            "        <fieldentry>False</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_END_DATE</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_RETRACT_DATE</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "     <qtimetadatafield>\n" +
            "        <fieldlabel>ASSESSMENT_RELEASED_TO</fieldlabel>\n" +
            "        <fieldentry>NROTC Proknowledge</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "     <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_PUBLISH_ANONYMOUS</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_AUTHENTICATED_USERS</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "       <qtimetadatafield>\n" +
            "        <fieldlabel>ALLOW_IP</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>CONSIDER_ALLOW_IP</fieldlabel>\n" +
            "        <fieldentry>False</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>CONSIDER_USERID</fieldlabel>\n" +
            "        <fieldentry>False</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>USERID</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>PASSWORD</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_ALLOW_IP</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_USERID</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>CONSIDER_DURATION</fieldlabel>\n" +
            "        <fieldentry>False</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>AUTO_SUBMIT</fieldlabel>\n" +
            "        <fieldentry>False</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_DURATION</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_AUTO_SUBMIT</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>NAVIGATION</fieldlabel>\n" +
            "        <fieldentry>RANDOM</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>QUESTION_LAYOUT</fieldlabel>\n" +
            "        <fieldentry>A</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>QUESTION_NUMBERING</fieldlabel>\n" +
            "        <fieldentry>CONTINUOUS</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_NAVIGATION</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_QUESTION_LAYOUT</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_QUESTION_NUMBERING</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>MARK_FOR_REVIEW</fieldlabel>\n" +
            "        <fieldentry>False</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>LATE_HANDLING</fieldlabel>\n" +
            "        <fieldentry>False</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>MAX_ATTEMPTS</fieldlabel>\n" +
            "        <fieldentry>1</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_LATE_HANDLING</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_MAX_ATTEMPTS</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>AUTO_SAVE</fieldlabel>\n" +
            "        <fieldentry>False</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_AUTO_SAVE</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_ASSESSFEEDBACK</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>SUBMISSION_MESSAGE</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>FINISH_URL</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_FINISH_URL</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>FEEDBACK_DELIVERY</fieldlabel>\n" +
            "        <fieldentry>NONE</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>FEEDBACK_COMPONENT_OPTION</fieldlabel>\n" +
            "        <fieldentry>SELECT_COMPONENTS</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>FEEDBACK_AUTHORING</fieldlabel>\n" +
            "        <fieldentry>QUESTION</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>FEEDBACK_DELIVERY_DATE</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_FEEDBACK_DELIVERY</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_FEEDBACK_COMPONENTS</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>FEEDBACK_SHOW_CORRECT_RESPONSE</fieldlabel>\n" +
            "        <fieldentry>False</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>FEEDBACK_SHOW_STUDENT_SCORE</fieldlabel>\n" +
            "        <fieldentry>False</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>FEEDBACK_SHOW_STUDENT_QUESTIONSCORE</fieldlabel>\n" +
            "        <fieldentry>False</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>FEEDBACK_SHOW_ITEM_LEVEL</fieldlabel>\n" +
            "        <fieldentry>False</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>FEEDBACK_SHOW_SELECTION_LEVEL</fieldlabel>\n" +
            "        <fieldentry>False</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>FEEDBACK_SHOW_GRADER_COMMENT</fieldlabel>\n" +
            "        <fieldentry>False</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>FEEDBACK_SHOW_STATS</fieldlabel>\n" +
            "        <fieldentry>False</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>FEEDBACK_SHOW_QUESTION</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>FEEDBACK_SHOW_RESPONSE</fieldlabel>\n" +
            "        <fieldentry>False</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>ANONYMOUS_GRADING</fieldlabel>\n" +
            "        <fieldentry>False</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>GRADE_SCORE</fieldlabel>\n" +
            "        <fieldentry>HIGHEST_SCORE</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>GRADEBOOK_OPTIONS</fieldlabel>\n" +
            "        <fieldentry>NONE</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_GRADEBOOK_OPTIONS</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_ANONYMOUS_GRADING</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_GRADE_SCORE</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>BGCOLOR</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>BGIMG</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_BGCOLOR</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_BGIMG</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_ASSESSMENT_METADATA</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_COLLECT_SECTION_METADATA</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>EDIT_COLLECT_ITEM_METADATA</fieldlabel>\n" +
            "        <fieldentry>True</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>ASSESSMENT_KEYWORDS</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>ASSESSMENT_OBJECTIVES</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>ASSESSMENT_RUBRICS</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>COLLECT_SECTION_METADATA</fieldlabel>\n" +
            "        <fieldentry>False</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>COLLECT_ITEM_METADATA</fieldlabel>\n" +
            "        <fieldentry>false</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>LAST_MODIFIED_ON</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>LAST_MODIFIED_BY</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>templateInfo_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>true</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>assessmentAuthor_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>true</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>assessmentCreator_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>false</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>description_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>true</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>dueDate_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>true</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>retractDate_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>true</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>anonymousRelease_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>false</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>authenticatedRelease_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>true</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>ipAccessType_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>false</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>passwordRequired_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>false</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>timedAssessment_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>true</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>timedAssessmentAutoSubmit_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>false</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>itemAccessType_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>true</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>displayChunking_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>true</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>displayNumbering_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>true</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>submissionModel_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>true</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>lateHandling_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>true</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>automaticSubmission_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>false</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>autoSave_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>false</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>submissionMessage_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>true</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>finalPageURL_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>true</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>feedbackType_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>true</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>feedbackComponents_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>true</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>testeeIdentity_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>true</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>toGradebook_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>true</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>recordedScore_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>false</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>bgColor_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>true</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>bgImage_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>true</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>metadataAssess_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>true</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>metadataParts_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>false</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>metadataQuestions_isInstructorEditable</fieldlabel>\n" +
            "        <fieldentry>true</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "    </qtimetadata>\n" +
            "    <assessmentcontrol feedbackswitch=\"Yes\" hintswitch=\"Yes\" solutionswitch=\"Yes\" view=\"All\"></assessmentcontrol>\n" +
            "    <rubric view=\"All\">\n" +
            "      <material>\n" +
            "        <mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"></mattext>\n" +
            "      </material>\n" +
            "    </rubric>\n" +
            "    <presentation_material>\n" +
            "      <flow_mat class=\"Block\">\n" +
            "        <material>\n" +
            "          <mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"><![CDATA[]]></mattext>\n" +
            "        </material>\n" +
            "      </flow_mat>\n" +
            "    </presentation_material>\n" +
            "    <assessfeedback ident=\"Feedback\" title=\"Feedback\" view=\"All\">\n" +
            "      <flow_mat class=\"Block\">\n" +
            "        <material>\n" +
            "          <mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"></mattext>\n" +
            "        </material>\n" +
            "      </flow_mat>\n" +
            "    </assessfeedback>\n" +
            "  <section ident=\"117945\" title=\"Default\">\n" +
            "  <qtimetadata>\n" +
            "    <qtimetadatafield>\n" +
            "      <fieldlabel>SECTION_INFORMATION</fieldlabel>\n" +
            "      <fieldentry></fieldentry>\n" +
            "    </qtimetadatafield>\n" +
            "    <qtimetadatafield>\n" +
            "      <fieldlabel>SECTION_OBJECTIVE</fieldlabel>\n" +
            "      <fieldentry></fieldentry>\n" +
            "    </qtimetadatafield>\n" +
            "    <qtimetadatafield>\n" +
            "      <fieldlabel>SECTION_KEYWORD</fieldlabel>\n" +
            "      <fieldentry></fieldentry>\n" +
            "    </qtimetadatafield>\n" +
            "    <qtimetadatafield>\n" +
            "      <fieldlabel>SECTION_RUBRIC</fieldlabel>\n" +
            "      <fieldentry></fieldentry>\n" +
            "    </qtimetadatafield>\n" +
            "    <qtimetadatafield>\n" +
            "      <fieldlabel>ATTACHMENT</fieldlabel>\n" +
            "      <fieldentry></fieldentry>\n" +
            "    </qtimetadatafield>\n" +
            "  </qtimetadata>\n" +
            "  <presentation_material>\n" +
            "    <flow_mat class=\"Block\">\n" +
            "    <material>\n" +
            "      <mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"></mattext>\n" +
            "    </material>\n" +
            "    <material>\n" +
            "      <matimage embedded=\"base64\" imagtype=\"text/html\" uri=\"\"></matimage>\n" +
            "    </material>\n" +
            "    </flow_mat>\n" +
            "  </presentation_material>\n" +
            "  <selection_ordering sequence_type=\"Normal\">\n" +
            "       <selection>\n" +
            "        <sourcebank_ref></sourcebank_ref>\n" +
            "        <selection_number></selection_number>\n" +
            "      </selection>\n" +
            "     <order order_type=\"Sequential\"></order>\n" +
            "  </selection_ordering>\n";
    //Question string variables
    private final String mc1 = "<item ident=\"590865\" title=\"Multiple Choice\">\n" +
            "  <duration></duration>\n" +
            "  <itemmetadata>\n" +
            "    <qtimetadata>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>qmd_itemtype</fieldlabel>\n" +
            "        <fieldentry>Multiple Choice</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>TEXT_FORMAT</fieldlabel>\n" +
            "        <fieldentry>HTML</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>ITEM_OBJECTIVE</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>ITEM_KEYWORD</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>ITEM_RUBRIC</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>ATTACHMENT</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>hasRationale</fieldlabel>\n" +
            "        <fieldentry>false</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>PARTIAL_CREDIT</fieldlabel>\n" +
            "        <fieldentry>FALSE</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>RANDOMIZE</fieldlabel>\n" +
            "        <fieldentry>true</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "    </qtimetadata>\n" +
            "  </itemmetadata>\n" +
            "<rubric view=\"All\">\n" +
            "      <material>\n" +
            "        <mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"></mattext>\n" +
            "      </material>\n" +
            "    </rubric>\n" +
            "  <presentation label=\"Resp003\">\n" +
            "    <flow class=\"Block\">\n" +
            "      <material>\n" +
            "        <mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"><![CDATA[";
    private final String mc2 = "]]></mattext>\n" +
            "      </material>\n" +
            "      <material>\n" +
            "        <matimage embedded=\"base64\" imagtype=\"text/html\" uri=\"\"></matimage>\n" +
            "      </material>\n" +
            "<response_lid ident=\"MCSC\" rcardinality=\"Single\" rtiming=\"No\">\n" +
            "        <render_choice shuffle=\"No\">\n";
    private final String mc3 = "<response_label rarea=\"Ellipse\" rrange=\"Exact\" rshuffle=\"Yes\"><material><mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"></mattext>\n" +
            "</material>\n" +
            "</response_label>\n" +
            "<response_label rarea=\"Ellipse\" rrange=\"Exact\" rshuffle=\"Yes\"><material><mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"></mattext>\n" +
            "</material>\n" +
            "</response_label>\n" +
            "<response_label rarea=\"Ellipse\" rrange=\"Exact\" rshuffle=\"Yes\"><material><mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"></mattext>\n" +
            "</material>\n" +
            "</response_label>\n" +
            "<response_label rarea=\"Ellipse\" rrange=\"Exact\" rshuffle=\"Yes\"><material><mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"></mattext>\n" +
            "</material>\n" +
            "</response_label>\n" +
            "</render_choice>\n" +
            "      </response_lid>\n" +
            "    </flow>\n" +
            "  </presentation>\n" +
            "  <resprocessing>\n" +
            "    <outcomes>\n" +
            "      <decvar defaultval=\"0\" maxvalue=\"4.0\" minvalue=\"0.0\" varname=\"SCORE\" vartype=\"Integer\"></decvar>\n" +
            "    </outcomes>\n";
            private final String mcra3 = "<respcondition continue=\"No\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">A</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"";
            private final String mcra4 = "\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"A1\"></displayfeedback>\n" +
            "    </respcondition>\n";
            private final String mcrb3 = "<respcondition continue=\"No\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">B</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"";
            private final String mcrb4 = "\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"B1\"></displayfeedback>\n" +
            "    </respcondition>\n";
            private final String mcrc3 = "<respcondition continue=\"No\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">C</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"";
            private final String mcrc4 = "\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"C1\"></displayfeedback>\n" +
            "    </respcondition>\n";
            private final String mcrd3 = "<respcondition continue=\"No\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">D</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"";
            private final String mcrd4 = "\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"D1\"></displayfeedback>\n" +
            "    </respcondition>\n";
            private final String mc4 = "<respcondition continue=\"Yes\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">E</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"InCorrect\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"D1\"></displayfeedback>\n" +
            "    </respcondition>\n" +
            "    <respcondition continue=\"Yes\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">F</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"InCorrect\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"D1\"></displayfeedback>\n" +
            "    </respcondition>\n" +
            "    <respcondition continue=\"Yes\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">G</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"InCorrect\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"D1\"></displayfeedback>\n" +
            "    </respcondition>\n" +
            "    <respcondition continue=\"Yes\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">H</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"InCorrect\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"D1\"></displayfeedback>\n" +
            "    </respcondition>\n" +
            "    <respcondition continue=\"Yes\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">I</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"InCorrect\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"D1\"></displayfeedback>\n" +
            "    </respcondition>\n" +
            "    <respcondition continue=\"Yes\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">J</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"InCorrect\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"D1\"></displayfeedback>\n" +
            "    </respcondition>\n" +
            "    <respcondition continue=\"Yes\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">K</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"InCorrect\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"D1\"></displayfeedback>\n" +
            "    </respcondition>\n" +
            "    <respcondition continue=\"Yes\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">L</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"InCorrect\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"D1\"></displayfeedback>\n" +
            "    </respcondition>\n" +
            "    <respcondition continue=\"Yes\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">M</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"InCorrect\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"D1\"></displayfeedback>\n" +
            "    </respcondition>\n" +
            "    <respcondition continue=\"Yes\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">N</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"InCorrect\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"D1\"></displayfeedback>\n" +
            "    </respcondition>\n" +
            "    <respcondition continue=\"Yes\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">O</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"InCorrect\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"D1\"></displayfeedback>\n" +
            "    </respcondition>\n" +
            "    <respcondition continue=\"Yes\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">P</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"InCorrect\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"D1\"></displayfeedback>\n" +
            "    </respcondition>\n" +
            "    <respcondition continue=\"Yes\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">Q</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"InCorrect\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"D1\"></displayfeedback>\n" +
            "    </respcondition>\n" +
            "    <respcondition continue=\"Yes\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">R</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"InCorrect\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"D1\"></displayfeedback>\n" +
            "    </respcondition>\n" +
            "    <respcondition continue=\"Yes\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">S</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"InCorrect\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"D1\"></displayfeedback>\n" +
            "    </respcondition>\n" +
            "    <respcondition continue=\"Yes\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">T</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"InCorrect\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"D1\"></displayfeedback>\n" +
            "    </respcondition>\n" +
            "    <respcondition continue=\"Yes\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">U</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"InCorrect\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"D1\"></displayfeedback>\n" +
            "    </respcondition>\n" +
            "    <respcondition continue=\"Yes\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">V</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"InCorrect\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"D1\"></displayfeedback>\n" +
            "    </respcondition>\n" +
            "    <respcondition continue=\"Yes\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">W</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"InCorrect\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"D1\"></displayfeedback>\n" +
            "    </respcondition>\n" +
            "    <respcondition continue=\"Yes\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">X</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"InCorrect\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"D1\"></displayfeedback>\n" +
            "    </respcondition>\n" +
            "    <respcondition continue=\"Yes\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">Y</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"InCorrect\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"D1\"></displayfeedback>\n" +
            "    </respcondition>\n" +
            "    <respcondition continue=\"Yes\">\n" +
            "      <conditionvar>\n" +
            "        <varequal case=\"Yes\" respident=\"MCSC\">Z</varequal>\n" +
            "      </conditionvar>\n" +
            "      <setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"InCorrect\"></displayfeedback>\n" +
            "      <displayfeedback feedbacktype=\"Response\" linkrefid=\"D1\"></displayfeedback>\n" +
            "    </respcondition>\n" +
            "  </resprocessing>\n" +
            "  <itemfeedback ident=\"A1\" view=\"All\">\n" +
            "    <flow_mat class=\"Block\">\n" +
            "      <material>\n" +
            "        <mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"></mattext>\n" +
            "      </material>\n" +
            "      <material>\n" +
            "        <matimage embedded=\"base64\" imagtype=\"text/html\" uri=\"\"></matimage>\n" +
            "      </material>\n" +
            "    </flow_mat>\n" +
            "  </itemfeedback>\n" +
            "  <itemfeedback ident=\"B1\" view=\"All\">\n" +
            "    <flow_mat class=\"Block\">\n" +
            "      <material>\n" +
            "        <mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"></mattext>\n" +
            "      </material>\n" +
            "      <material>\n" +
            "        <matimage embedded=\"base64\" imagtype=\"text/html\" uri=\"\"></matimage>\n" +
            "      </material>\n" +
            "    </flow_mat>\n" +
            "  </itemfeedback>\n" +
            "  <itemfeedback ident=\"C1\" view=\"All\">\n" +
            "    <flow_mat class=\"Block\">\n" +
            "      <material>\n" +
            "        <mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"></mattext>\n" +
            "      </material>\n" +
            "      <material>\n" +
            "        <matimage embedded=\"base64\" imagtype=\"text/html\" uri=\"\"></matimage>\n" +
            "      </material>\n" +
            "    </flow_mat>\n" +
            "  </itemfeedback>\n" +
            "  <itemfeedback ident=\"D1\" view=\"All\">\n" +
            "    <flow_mat class=\"Block\">\n" +
            "      <material>\n" +
            "        <mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"></mattext>\n" +
            "      </material>\n" +
            "      <material>\n" +
            "        <matimage embedded=\"base64\" imagtype=\"text/html\" uri=\"\"></matimage>\n" +
            "      </material>\n" +
            "    </flow_mat>\n" +
            "  </itemfeedback>\n" +
            "  <itemfeedback ident=\"Correct\" view=\"All\">\n" +
            "    <flow_mat class=\"Block\">\n" +
            "      <material>\n" +
            "        <mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"></mattext>\n" +
            "      </material>\n" +
            "      <material>\n" +
            "        <matimage embedded=\"base64\" imagtype=\"text/html\" uri=\"\"></matimage>\n" +
            "      </material>\n" +
            "    </flow_mat>\n" +
            "  </itemfeedback>\n" +
            "  <itemfeedback ident=\"InCorrect\" view=\"All\">\n" +
            "    <flow_mat class=\"Block\">\n" +
            "      <material>\n" +
            "        <mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"></mattext>\n" +
            "      </material>\n" +
            "      <material>\n" +
            "        <matimage embedded=\"base64\" imagtype=\"text/html\" uri=\"\"></matimage>\n" +
            "      </material>\n" +
            "    </flow_mat>\n" +
            "  </itemfeedback>\n" +
            "</item>\n";
    private final String mcra1 =  "<response_label ident=\"A\" rarea=\"Ellipse\" rrange=\"Exact\" rshuffle=\"Yes\">\n" +
            "            <material>\n" +
            "              <mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"><![CDATA[";
    private final String mcra2 = "]]></mattext>\n" +
            "            </material>\n" +
            "            <material>\n" +
            "              <matimage embedded=\"base64\" imagtype=\"text/html\" uri=\"\"></matimage>\n" +
            "            </material>\n" +
            "          </response_label>";
    private final String mcrb1 = "<response_label ident=\"B\" rarea=\"Ellipse\" rrange=\"Exact\" rshuffle=\"Yes\">\n" +
            "            <material>\n" +
            "              <mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"><![CDATA[";
    private final String mcrb2 = "]]></mattext>\n" +
            "            </material>\n" +
            "            <material>\n" +
            "              <matimage embedded=\"base64\" imagtype=\"text/html\" uri=\"\"></matimage>\n" +
            "            </material>\n" +
            "          </response_label>";
    private final String mcrc1 = "<response_label ident=\"C\" rarea=\"Ellipse\" rrange=\"Exact\" rshuffle=\"Yes\">\n" +
            "            <material>\n" +
            "              <mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"><![CDATA[";
    private final String mcrc2 = "]]></mattext>\n" +
            "            </material>\n" +
            "            <material>\n" +
            "              <matimage embedded=\"base64\" imagtype=\"text/html\" uri=\"\"></matimage>\n" +
            "            </material>\n" +
            "          </response_label>";
    private final String mcrd1 = "<response_label ident=\"D\" rarea=\"Ellipse\" rrange=\"Exact\" rshuffle=\"Yes\">\n" +
            "            <material>\n" +
            "              <mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"><![CDATA[";
    private final String mcrd2 = "]]></mattext>\n" +
            "            </material>\n" +
            "            <material>\n" +
            "              <matimage embedded=\"base64\" imagtype=\"text/html\" uri=\"\"></matimage>\n" +
            "            </material>\n" +
            "          </response_label>";
    private final String tf1 = "<item ident=\"590866\" title=\"True - False\">\n" +
            "\t<qticomment>\n" +
            "\t\tThis is a simple True/False multiple-choice example using V1.2.\n" +
            "\t\tThe rendering is a standard radio button style.\n" +
            "\t\tResponse processing is incorporated.\n" +
            "\t</qticomment>\n" +
            "\t<duration></duration>\n" +
            "\t<itemmetadata>\n" +
            "\t\t<qtimetadata>\n" +
            "\t\t\t<qtimetadatafield>\n" +
            "\t\t\t\t<fieldlabel>qmd_itemtype</fieldlabel>\n" +
            "\t\t\t\t<fieldentry>True False</fieldentry>\n" +
            "\t\t\t</qtimetadatafield>\n" +
            "\t\t\t<qtimetadatafield>\n" +
            "\t\t\t\t<fieldlabel>TEXT_FORMAT</fieldlabel>\n" +
            "\t\t\t\t<fieldentry>HTML</fieldentry>\n" +
            "\t\t\t</qtimetadatafield>\n" +
            "\t\t\t<qtimetadatafield>\n" +
            "        <fieldlabel>ITEM_OBJECTIVE</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>ITEM_KEYWORD</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>ITEM_RUBRIC</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>ATTACHMENT</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>hasRationale</fieldlabel>\n" +
            "        <fieldentry>false</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "\t\t</qtimetadata>\n" +
            "\t</itemmetadata>\n" +
            "\t<rubric view=\"All\">\n" +
            "      <material>\n" +
            "        <mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"></mattext>\n" +
            "      </material>\n" +
            "    </rubric>\n" +
            "\t<presentation label=\"Resp001\">\n" +
            "\t\t<flow class=\"Block\">\n" +
            "\t\t\t<material>\n" +
            "\t\t\t\t<mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"><![CDATA[";
    private final String tf2 = "]]></mattext>\n" +
            "\t\t\t</material>\n" +
            "\t\t\t<material>\n" +
            "\t\t\t\t<matimage embedded=\"base64\" imagtype=\"text/html\" uri=\"\"></matimage>\n" +
            "\t\t\t</material>\n" +
            "\t\t\t<response_lid ident=\"TF02\" rcardinality=\"Single\" rtiming=\"No\">\n" +
            "\t\t\t\t<render_choice shuffle=\"No\">\n" +
            "\t\t\t\t\t<response_label ident=\"A\" rarea=\"Ellipse\" rrange=\"Exact\" rshuffle=\"Yes\">\n" +
            "\t\t\t\t\t\t<material>\n" +
            "\t\t\t\t\t\t\t<mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\">True</mattext>\n" +
            "\t\t\t\t\t\t</material>\n" +
            "\t\t\t\t\t</response_label>\n" +
            "\t\t\t\t\t<response_label ident=\"B\" rarea=\"Ellipse\" rrange=\"Exact\" rshuffle=\"Yes\">\n" +
            "\t\t\t\t\t\t<material>\n" +
            "\t\t\t\t\t\t\t<mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\">False</mattext>\n" +
            "\t\t\t\t\t\t</material>\n" +
            "\t\t\t\t\t</response_label>\n" +
            "\t\t\t\t</render_choice>\n" +
            "\t\t\t</response_lid>\n" +
            "\t\t</flow>\n" +
            "\t</presentation>\n" +
            "\t<resprocessing>\n" +
            "\t\t<outcomes>\n" +
            "\t\t\t<decvar defaultval=\"0\" maxvalue=\"4.0\" minvalue=\"0.0\" varname=\"SCORE\" vartype=\"Integer\"></decvar>\n" +
            "\t\t</outcomes>\n" +
            "\t\t<respcondition continue=\"No\" title=\"Correct\">\n" +
            "\t\t\t<conditionvar>\n" +
            "\t\t\t\t<varequal case=\"Yes\" respident=\"TF02\">A</varequal>\n" +
            "\t\t\t</conditionvar>\n" +
            "\t\t\t<setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "\t\t\t<displayfeedback feedbacktype=\"Response\" linkrefid=\"Correct\"></displayfeedback>\n" +
            "\t\t</respcondition>\n" +
            "\t\t<respcondition continue=\"No\" title=\"InCorrect\">\n" +
            "\t\t\t<conditionvar>\n" +
            "\t\t\t\t<varequal case=\"Yes\" respident=\"TF02\">B</varequal>\n" +
            "\t\t\t</conditionvar>\n" +
            "\t\t\t<setvar action=\"Add\" varname=\"SCORE\">0</setvar>\n" +
            "\t\t\t<displayfeedback feedbacktype=\"Response\" linkrefid=\"InCorrect\"></displayfeedback>\n" +
            "\t\t</respcondition>\n" +
            "\t</resprocessing>\n" +
            "\t<itemfeedback ident=\"Correct\" view=\"All\">\n" +
            "\t\t<flow_mat class=\"Block\">\n" +
            "\t\t\t<material>\n" +
            "\t\t\t\t<mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"></mattext>\n" +
            "\t\t\t</material>\n" +
            "\t\t\t<material>\n" +
            "                <matimage embedded=\"base64\" imagtype=\"text/html\" uri=\"\"></matimage>\n" +
            "            </material>\n" +
            "\t\t</flow_mat>\n" +
            "\t</itemfeedback>\n" +
            "\t<itemfeedback ident=\"InCorrect\" view=\"All\">\n" +
            "\t\t<flow_mat class=\"Block\">\n" +
            "\t\t\t<material>\n" +
            "\t\t\t\t<mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"></mattext>\n" +
            "\t\t\t</material>\n" +
            "\t\t\t<material>\n" +
            "                <matimage embedded=\"base64\" imagtype=\"text/html\" uri=\"\"></matimage>\n" +
            "            </material>\n" +
            "\t\t</flow_mat>\n" +
            "\t</itemfeedback>\n" +
            "</item>\n";
    private final String es1 = "<item ident=\"590867\" title=\"Essay Question\">\n" +
            "  <qticomment></qticomment>\n" +
            "  <duration></duration>\n" +
            "  <itemmetadata>\n" +
            "    <qtimetadata>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>qmd_itemtype</fieldlabel>\n" +
            "        <fieldentry>Essay</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>TEXT_FORMAT</fieldlabel>\n" +
            "        <fieldentry>HTML</fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>ITEM_OBJECTIVE</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>ITEM_KEYWORD</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>ITEM_RUBRIC</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "      <qtimetadatafield>\n" +
            "        <fieldlabel>ATTACHMENT</fieldlabel>\n" +
            "        <fieldentry></fieldentry>\n" +
            "      </qtimetadatafield>\n" +
            "    </qtimetadata>\n" +
            "  </itemmetadata>\n" +
            "    <rubric view=\"All\">\n" +
            "      <material>\n" +
            "        <mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"></mattext>\n" +
            "      </material>\n" +
            "    </rubric>\n" +
            "  <presentation label=\"Model Short Answer\">\n" +
            "    <flow class=\"Block\">\n" +
            "      <material>\n" +
            "        <mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"><![CDATA[";
    private final String es2 = "]]></mattext>\n" +
            "      </material>\n" +
            "      <material>\n" +
            "        <matimage embedded=\"base64\" imagtype=\"text/html\" uri=\"\"></matimage>\n" +
            "      </material>\n" +
            "      <response_lid ident=\"LID01\" rcardinality=\"Single\" rtiming=\"No\">\n" +
            "        <render_choice shuffle=\"No\">\n" +
            "          <response_label ident=\"A\" rarea=\"Ellipse\" rrange=\"Exact\" rshuffle=\"Yes\">\n" +
            "            <material>\n" +
            "              <mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"></mattext>\n" +
            "            </material>\n" +
            "            <material>\n" +
            "              <matimage embedded=\"base64\" imagtype=\"text/html\" uri=\"\"></matimage>\n" +
            "            </material>\n" +
            "          </response_label>\n" +
            "        </render_choice>\n" +
            "      </response_lid>\n" +
            "    </flow>\n" +
            "  </presentation>\n" +
            "  <resprocessing>\n" +
            "    <outcomes>\n" +
            "      <decvar defaultval=\"0\" maxvalue=\"0.0\" minvalue=\"0.0\" varname=\"SCORE\" vartype=\"Integer\"></decvar>\n" +
            "    </outcomes>\n" +
            "  </resprocessing>\n" +
            "  <itemfeedback ident=\"Correct\" view=\"All\">\n" +
            "    <flow_mat class=\"Block\">\n" +
            "      <material>\n" +
            "        <mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"></mattext>\n" +
            "      </material>\n" +
            "      <material>\n" +
            "        <matimage embedded=\"base64\" imagtype=\"text/html\" uri=\"\"></matimage>\n" +
            "      </material>\n" +
            "    </flow_mat>\n" +
            "  </itemfeedback>\n" +
            "  <itemfeedback ident=\"InCorrect\" view=\"All\">\n" +
            "    <flow_mat class=\"Block\">\n" +
            "      <material>\n" +
            "        <mattext charset=\"ascii-us\" texttype=\"text/plain\" xml:space=\"default\"></mattext>\n" +
            "      </material>\n" +
            "      <material>\n" +
            "        <matimage embedded=\"base64\" imagtype=\"text/html\" uri=\"\"></matimage>\n" +
            "      </material>\n" +
            "    </flow_mat>\n" +
            "  </itemfeedback>\n" +
            "</item>\n";
    private final String end = "</section>\n" +
            "</assessment>\n" +
            "</questestinterop>";

    private final String mfst1 = "<?xml version=\"1.0\"  encoding=\"UTF-8\" ?>\n" +
            "<manifest identifier=\"MANIFEST1\" xmlns=\"http://www.imsglobal.org/xsd/imscp_v1p1\" " +
            "xmlns:imsmd=\"http://www.imsglobal.org/xsd/imsmd_v1p2\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" " +
            "xsi:schemaLocation=\"http://www.imsglobal.org/xsd/imscp_v1p1 " +
            "http://www.imsglobal.org/xsd/imscp_v1p1.xsd http://www.imsglobal.org/xsd/imsmd_v1p2 " +
            "http://www.imsglobal.org/xsd/imsmd_v1p2.xsd\"><metadata><imsmd:lom><imsmd:general>" +
            "<imsmd:identifier><imsmd:langstring xml:lang=\"en-US\">158e56c0f76</imsmd:langstring>\n" +
            "\n" +
            "</imsmd:identifier>\n" +
            "\n" +
            "<imsmd:title><imsmd:langstring xml:lang=\"en-US\">exportAssessment</imsmd:langstring>\n" +
            "\n" +
            "</imsmd:title>\n" +
            "\n" +
            "</imsmd:general>\n" +
            "\n" +
            "</imsmd:lom>\n" +
            "\n" +
            "</metadata>\n" +
            "\n" +
            "<organizations></organizations>\n" +
            "\n" +
            "<resources><resource href=\"";

    private final String mfst2 = "\" identifier=\"RESOURCE1\" type=\"imsqti_xmlv1p1\">" +
            "<file href=\"exportAssessment.xml\"></file>\n" +
            "\n" +
            "</resource>\n" +
            "\n" +
            "</resources>\n" +
            "\n" +
            "</manifest>\n";

    public String getHeader1() { return header1; }

    public String getHeader2() { return header2; }

    public String getHeader3() { return header3; }

    public String getHeader4() { return header4; }

    public String getMc1() { return mc1; }

    public String getMc2() { return mc2; }

    public String getMc3() { return mc3; }

    public String getMc4() { return mc4; }

    public String getMcra1() { return mcra1; }

    public String getMcra2() { return mcra2; }

    public String getMcrb1() { return mcrb1; }

    public String getMcrb2() { return mcrb2; }

    public String getMcrc1() { return mcrc1; }

    public String getMcrc2() { return mcrc2; }

    public String getMcrd1() { return mcrd1; }

    public String getMcrd2() { return mcrd2; }

    public String getMcra3() { return mcra3; }

    public String getMcra4() { return mcra4; }

    public String getMcrb3() { return mcrb3; }

    public String getMcrb4() { return mcrb4; }

    public String getMcrc3() { return mcrc3; }

    public String getMcrc4() { return mcrc4; }

    public String getMcrd3() { return mcrd3; }

    public String getMcrd4() { return mcrd4; }

    public String getTf1() { return tf1; }

    public String getTf2() { return tf2; }

    public String getEs1() { return es1; }

    public String getEs2() { return es2; }

    public String getEnd() { return end; }

    public String getMfst1() { return mfst1; }

    public String getMfst2() { return mfst2; }

}
