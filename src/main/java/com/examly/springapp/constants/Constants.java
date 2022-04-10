package com.examly.springapp.constants;

public class Constants {
    // Roles
    public static final String ROLE_ADMIN="ROLE_admin";
    public static final String ROLE_STUDENT="ROLE_student";
    public static final String ROLE="Role";
    public static final String USER_ID="userId";
    public static final String ERROR="Error";
    public static final String ID="id";
    public static final String INSTITUTE_ID="instituteId";
    public static final String ADMISSION_ID="admissionId";
    public static final String COURSE_ID="courseId";
    public static final String REVIEW_ID="reviewId";


    // AdminServiceImpl
    public static final String SAVE_EXCEPTION="Exception thrown during Saving Admin :";

    // AdmissionServiceImpl

    public static final String ADMISSION_ACCEPTED="Admission Accepted";
    public static final String ADMISSION_DENIED="Admission Denied";
    public static final String ADMISSION_EDITED="Admission Edited";
    public static final String ADMISSION_DELETED="Admission Deleted";
    public static final String ADMISSION_CANNOT_ACCEPT="Cannot Accept, already Accepted one offer.";
    public static final String ADMISSION_FIELDS_EMPTY="Some fields are empty";

    // CourseServiceImpl

    public static final String COURSE_FIELDS_EMPTY="Some Course fields is Empty";
    public static final String COURSE_NOT_FOUND="Course not found";

    // InstituteServiceImpl

    public static final String INSTITUTE_FIELDS_EMPTY="Some Institute fields are empty";
    public static final String INSTITUTE_NOT_FOUND="Institute not found";
    public static final String INSTITUTE_LIST_EMPTY="Institute list is empty";
    

    // ReviewServiceImpl

    public static final String REVIEW_SAVED="Review Saved";
    public static final String REVIEW_EDITED="Review Edited";
    public static final String REVIEW_DELETED="Review Deleted";

    // UserServiceImpl

    public static final String EXCEPTION_SAVE_USER="Exception thrown during Saving User : ";
    public static final String EMAIL_PASSWORD_WRONG="Email or Password wrong";

    // AdmissionController

    public static final String APPLIED_FOR_ADMISSION="Applied for Admission";

    //CourseController

    public static final String COURSE_EDITED="Course Edited";
    public static final String COURSE_DELETED="Course deleted";
    public static final String COURSE_NOT_FOUND_TO_DELETE="Course not found to be deleted";

    // InstituteController
    public static final String INSTITUTE_SAVED = "Institute Saved";
    public static final String INSTITUTE_EDITED="Institute Edited";
    public static final String INSTITUTE_DELETED="Institute Deleted";
    public static final String INSTITUTE_NOT_FOUND_TO_DELETE="Institute not found to be deleted";

    // SignUpController
    public static final String ADMIN_SAVED="Admin Saved";
    public static final String USER_SAVED="User Saved";

    // SQL Queries

    // AddressRepository

    public static final String FIND_BY_ADMISSION_ID_QUERY="select * from address where address.admission_id=?1";
    public static final String EDIT_ADDRESS_QUERY="update address set house_number=?1, street_number=?2, area_name=?3, state=?4, pin_code=?5, nationality=?6 where admission_id=?7";

    // AdmissionRepository

    public static final String FIND_BY_USER_ID_QUERY="select * from admission where admission.user_id= :userId";
    public static final String GET_ALL_ADMISSION_REQUESTS_QUERY="select admission_id as admissionId, accepted as accepted, age as age, denied as denied , eligibility as eligibility, email as email, father_name as fatherName, first_name as firstName, gender as gender, hsc_marks as hscMarks, hsc_name as hscName, last_name as lastName, mobile as mobile, mother_name as motherName, course_id as courseId, user_id as userId from admission where admission.accepted=false and admission.denied=false";
    public static final String ACCEPT_ADMISSION_QUERY="update admission set admission.accepted=true where admission.admission_id=?1";
    public static final String DENY_ADMISSION_QUERY="update admission set admission.denied=true where admission.admission_id=?1";
    public static final String GET_ALL_ACCEPTED_ADMISSION_QUERY="select admission_id as admissionId, accepted as accepted, age as age, denied as denied , eligibility as eligibility, email as email, father_name as fatherName, first_name as firstName, gender as gender, hsc_marks as hscMarks, hsc_name as hscName, last_name as lastName, mobile as mobile, mother_name as motherName, course_id as courseId, user_id as userId from admission where admission.accepted=true";
    public static final String GET_ALL_DENIED_ADMISSION_QUERY="select admission_id as admissionId, accepted as accepted, age as age, denied as denied , eligibility as eligibility, email as email, father_name as fatherName, first_name as firstName, gender as gender, hsc_marks as hscMarks, hsc_name as hscName, last_name as lastName, mobile as mobile, mother_name as motherName, course_id as courseId, user_id as userId from admission where admission.denied=true";
    public static final String GET_ADMISSION_BY_ID="select admission_id as admissionId, accepted as accepted, age as age, denied as denied , eligibility as eligibility, email as email, father_name as fatherName, first_name as firstName, gender as gender, hsc_marks as hscMarks, hsc_name as hscName, last_name as lastName, mobile as mobile, mother_name as motherName, course_id as courseId, user_id as userId from admission where admission.admission_id=?1";
    public static final String EDIT_ADMISSION_QUERY="update admission set first_name=?1, last_name=?2, email=?3, mobile=?4, gender=?5, father_name=?6, mother_name=?7, age=?8, hsc_name=?9, hsc_marks=?10, eligibility=?11 where  admission_id=?12";
    public static final String DELETE_ADMISSION_QUERY="delete from admission where admission_id=?1";
    public static final String ACCEPT_ADMISSION_BY_STUDENT_QUERY="update admission set accepted_by_student=true where admission_id= ?1";
    public static final String DENY_ADMISSION_BY_STUDENT_QUERY="update admission set denied_by_student=true where admission_id= ?1";
    public static final String DENY_ALL_ADMISSION_QUERY="update admission set denied_by_student=true where accepted_by_student=false and user_id=?1";
    public static final String GET_ACCEPTED_ADMISSION_BY_STUDENT_QUERY="select admission_id as admissionId, accepted as accepted, accepted_by_student as acceptedByStudent, age as age, denied as denied, denied_by_student as deniedByStudent, eligibility as eligibility, email as email, father_name as fatherName, first_name as firstName, gender as gender, hsc_marks as hscMarks, hsc_name as hscName, last_name as lastName, mobile as mobile, mother_name as motherName, course_id as courseId, user_id as userId from admission where user_id=?1 and accepted_by_student=true ";
    public static final String GET_DENIED_ADMISSION_BY_STUDENT_QUERY="select admission_id as admissionId, accepted as accepted, age as age, denied as denied,accepted_by_student as acceptedByStudent, denied_by_student as deniedByStudent, eligibility as eligibility, email as email, father_name as fatherName, first_name as firstName, gender as gender, hsc_marks as hscMarks, hsc_name as hscName, last_name as lastName, mobile as mobile, mother_name as motherName, course_id as courseId, user_id as userId from admission where user_id=?1 and denied_by_student=true ";
    public static final String COUNT_ACCEPTED_ADMISSION_QUERY="select count(user_id) from admission where accepted_by_student=true and user_id=?1";


    // CoursesRepository

    public static final String GET_ALL_COURSES_WITH_INSTITUTE_ID_QUERY="select course_id as courseId, course_academic_year as courseAcademicYear,course_description as courseDescription,course_duration as courseDuration, course_name as courseName, course_required_percentage as courseRequiredPercentage, course_student_count as courseStudentCount, course_timing as courseTiming, institute_id as instituteId from courses where courses.institute_id= :instituteId ";
    public static final String GET_ALL_COURSES_QUERY="select course_id as courseId, course_academic_year as courseAcademicYear,course_description as courseDescription,course_duration as courseDuration, course_name as courseName, course_required_percentage as courseRequiredPercentage, course_student_count as courseStudentCount, course_timing as courseTiming, institute_id as instituteId from courses";
    public static final String EDIT_COURSE_BY_ID_QUERY="update courses set course_name= ?2, course_description= ?3, course_duration= ?4, course_timing= ?5, course_student_count= ?6, course_academic_year= ?7, course_required_percentage= ?8 where course_id= ?1 ";
    public static final String DELETE_COURSE_BY_ID_QUERY="delete from courses where course_id = ?1";

    // InstituteRepository

    public static final String GET_ALL_INSTITUTE_QUERY="select * from institute";
    public static final String EDIT_INSTITUTE_BY_ID_QUERY="update institute set institute_name= ?2, institute_description= ?3, institute_city= ?4, institute_state= ?5, institute_email= ?6,institute_mobile= ?7,nirf_rank= ?8   where institute_id= ?1";
    public static final String DELETE_INSTITUTE_BY_ID_QUERY="delete from institute where institute_id= :id";

    // ReviewRepository

    public static final String EDIT_REVIEW_QUERY="update review set message= ?1, star_rating= ?2 where review_id= ?3";
    public static final String DELETE_REVIEW_QUERY="delete from review where review_id= ?1";
    public static final String GET_REVIEW_BY_COURSE_ID_QUERY="select review_id as reviewId, message as message, star_rating as starRating, course_id as courseId, user_id as userId from review where course_id= ?1";
    public static final String GET_REVIEW_BY_USER_ID_QUERY="select review_id as reviewId, message as message, star_rating as starRating, course_id as courseId, user_id as userId from review where user_id= ?1";

    // Url Mappings

    // AdmissionController

    public static final String ENROLL_URL_MAPPING="/user/enroll";
    public static final String GET_ADMISSION_REQUESTS_URL_MAPPING="/admin/getAllAdmissionRequests";
    public static final String ACCEPT_ADMISSION_URL_MAPPING="/admin/acceptAdmission";
    public static final String DENY_ADMISSION_URL_MAPPING="/admin/denyAdmission";
    public static final String GET_ALL_ACCEPTED_ADMISSION_URL_MAPPING="admin/getAllAcceptedAdmission";
    public static final String GET_ALL_DENIED_ADMISSION_URL_MAPPING="admin/getAllDeniedAdmission";
    public static final String GET_ADMISSION_URL_MAPPING="/admin/getAdmission";
    public static final String EDIT_ADMISSION_URL_MAPPING="/admin/editAdmission";
    public static final String GET_ALL_APPLIED_ADMISSION_BY_STUDENT_URL_MAPPING="/user/getAllAppliedAdmissionByStudent";
    public static final String DELETE_ADMISSION_URL_MAPPING="/admin/deleteAdmission";
    public static final String ACCEPT_ADMISSION_BY_STUDENT_URL_MAPPING="/user/acceptAdmissionByStudent";
    public static final String DENY_ADMISSION_BY_STUDENT_URL_MAPPING="/user/denyAdmissionByStudent";
    public static final String GET_ACCEPTED_ADMISSION_BY_STUDENT_URL_MAPPING="/user/getAcceptedAdmissionByStudent";
    public static final String GET_DENIED_ADMISSION_BY_STUDENT_URL_MAPPING="/user/getDeniedAdmissionByStudent";

    // Course Controller Url Mapping

    public static final String ADD_COURSE_URL_MAPPING="/**/addCourse";
    public static final String VIEW_ALL_COURSES_URL_MAPPING="/**/viewCourses";
    public static final String VIEW_COURSES_BY_ID_URL_MAPPING="/**/viewCourse/{courseId}";
    public static final String EDIT_COURSE_URL_MAPPING="/**/editCourse/{courseId}";
    public static final String DELETE_COURSE_URL_MAPPING="/**/deleteCourse/{courseId}";

    // Institute Controller Url Mapping

    public static final String ADD_INSTITUTE_URL_MAPPING="/**/addInstitute";
    public static final String VIEW_ALL_INSTITUTE_URL_MAPPING="/**/viewInstitutes";
    public static final String VIEW_INSTITUTE_BY_ID_URL_MAPPING="/**/viewInstitute/{instituteId}";
    public static final String EDIT_INSTITUTE_URL_MAPPING="/**/editInstitute/{instituteId}";
    public static final String DELETE_INSTITUTE_URL_MAPPING="/**/deleteInstitute/{instituteId}";

    // Login Controller Url Mapping

    public static final String ADMIN_LOGIN_URL_MAPPING="/admin/login";
    public static final String STUDENT_LOGIN_URL_MAPPING="/user/login";

    // Review Controller Url Mapping

    public static final String ADD_REVIEW_URL_MAPPING="/**/addReview";
    public static final String EDIT_REVIEW_URL_MAPPING="/**/editReview/{reviewId}";
    public static final String DELETE_REVIEW_URL_MAPPING="/deleteReview/{reviewId}";
    public static final String GET_REVIEWS_BY_COURSE_ID="/getReviewsByCourseId/{courseId}";
    public static final String GET_REVIEWS_BY_USER_ID="/getReviewByUserId/{userId}";

    // SignUp Controller Url Mapping

    public static final String ADMIN_SIGNUP_URL_MAPPING="/admin/signup";
    public static final String STUDENT_SIGNUP_URL_MAPPING="/user/signup";



}
