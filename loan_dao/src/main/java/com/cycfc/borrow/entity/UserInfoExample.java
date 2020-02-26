package com.cycfc.borrow.entity;

import java.util.ArrayList;
import java.util.List;

public class UserInfoExample {
    /**
     * CF_USER_INFO
     */
    protected String orderByClause;

    /**
     * CF_USER_INFO
     */
    protected boolean distinct;

    /**
     * CF_USER_INFO
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public UserInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * CF_USER_INFO null
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andCstnoIsNull() {
            addCriterion("CSTNO is null");
            return (Criteria) this;
        }

        public Criteria andCstnoIsNotNull() {
            addCriterion("CSTNO is not null");
            return (Criteria) this;
        }

        public Criteria andCstnoEqualTo(String value) {
            addCriterion("CSTNO =", value, "cstno");
            return (Criteria) this;
        }

        public Criteria andCstnoNotEqualTo(String value) {
            addCriterion("CSTNO <>", value, "cstno");
            return (Criteria) this;
        }

        public Criteria andCstnoGreaterThan(String value) {
            addCriterion("CSTNO >", value, "cstno");
            return (Criteria) this;
        }

        public Criteria andCstnoGreaterThanOrEqualTo(String value) {
            addCriterion("CSTNO >=", value, "cstno");
            return (Criteria) this;
        }

        public Criteria andCstnoLessThan(String value) {
            addCriterion("CSTNO <", value, "cstno");
            return (Criteria) this;
        }

        public Criteria andCstnoLessThanOrEqualTo(String value) {
            addCriterion("CSTNO <=", value, "cstno");
            return (Criteria) this;
        }

        public Criteria andCstnoLike(String value) {
            addCriterion("CSTNO like", value, "cstno");
            return (Criteria) this;
        }

        public Criteria andCstnoNotLike(String value) {
            addCriterion("CSTNO not like", value, "cstno");
            return (Criteria) this;
        }

        public Criteria andCstnoIn(List<String> values) {
            addCriterion("CSTNO in", values, "cstno");
            return (Criteria) this;
        }

        public Criteria andCstnoNotIn(List<String> values) {
            addCriterion("CSTNO not in", values, "cstno");
            return (Criteria) this;
        }

        public Criteria andCstnoBetween(String value1, String value2) {
            addCriterion("CSTNO between", value1, value2, "cstno");
            return (Criteria) this;
        }

        public Criteria andCstnoNotBetween(String value1, String value2) {
            addCriterion("CSTNO not between", value1, value2, "cstno");
            return (Criteria) this;
        }

        public Criteria andLogonidIsNull() {
            addCriterion("LOGONID is null");
            return (Criteria) this;
        }

        public Criteria andLogonidIsNotNull() {
            addCriterion("LOGONID is not null");
            return (Criteria) this;
        }

        public Criteria andLogonidEqualTo(String value) {
            addCriterion("LOGONID =", value, "logonid");
            return (Criteria) this;
        }

        public Criteria andLogonidNotEqualTo(String value) {
            addCriterion("LOGONID <>", value, "logonid");
            return (Criteria) this;
        }

        public Criteria andLogonidGreaterThan(String value) {
            addCriterion("LOGONID >", value, "logonid");
            return (Criteria) this;
        }

        public Criteria andLogonidGreaterThanOrEqualTo(String value) {
            addCriterion("LOGONID >=", value, "logonid");
            return (Criteria) this;
        }

        public Criteria andLogonidLessThan(String value) {
            addCriterion("LOGONID <", value, "logonid");
            return (Criteria) this;
        }

        public Criteria andLogonidLessThanOrEqualTo(String value) {
            addCriterion("LOGONID <=", value, "logonid");
            return (Criteria) this;
        }

        public Criteria andLogonidLike(String value) {
            addCriterion("LOGONID like", value, "logonid");
            return (Criteria) this;
        }

        public Criteria andLogonidNotLike(String value) {
            addCriterion("LOGONID not like", value, "logonid");
            return (Criteria) this;
        }

        public Criteria andLogonidIn(List<String> values) {
            addCriterion("LOGONID in", values, "logonid");
            return (Criteria) this;
        }

        public Criteria andLogonidNotIn(List<String> values) {
            addCriterion("LOGONID not in", values, "logonid");
            return (Criteria) this;
        }

        public Criteria andLogonidBetween(String value1, String value2) {
            addCriterion("LOGONID between", value1, value2, "logonid");
            return (Criteria) this;
        }

        public Criteria andLogonidNotBetween(String value1, String value2) {
            addCriterion("LOGONID not between", value1, value2, "logonid");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andSttIsNull() {
            addCriterion("STT is null");
            return (Criteria) this;
        }

        public Criteria andSttIsNotNull() {
            addCriterion("STT is not null");
            return (Criteria) this;
        }

        public Criteria andSttEqualTo(String value) {
            addCriterion("STT =", value, "stt");
            return (Criteria) this;
        }

        public Criteria andSttNotEqualTo(String value) {
            addCriterion("STT <>", value, "stt");
            return (Criteria) this;
        }

        public Criteria andSttGreaterThan(String value) {
            addCriterion("STT >", value, "stt");
            return (Criteria) this;
        }

        public Criteria andSttGreaterThanOrEqualTo(String value) {
            addCriterion("STT >=", value, "stt");
            return (Criteria) this;
        }

        public Criteria andSttLessThan(String value) {
            addCriterion("STT <", value, "stt");
            return (Criteria) this;
        }

        public Criteria andSttLessThanOrEqualTo(String value) {
            addCriterion("STT <=", value, "stt");
            return (Criteria) this;
        }

        public Criteria andSttLike(String value) {
            addCriterion("STT like", value, "stt");
            return (Criteria) this;
        }

        public Criteria andSttNotLike(String value) {
            addCriterion("STT not like", value, "stt");
            return (Criteria) this;
        }

        public Criteria andSttIn(List<String> values) {
            addCriterion("STT in", values, "stt");
            return (Criteria) this;
        }

        public Criteria andSttNotIn(List<String> values) {
            addCriterion("STT not in", values, "stt");
            return (Criteria) this;
        }

        public Criteria andSttBetween(String value1, String value2) {
            addCriterion("STT between", value1, value2, "stt");
            return (Criteria) this;
        }

        public Criteria andSttNotBetween(String value1, String value2) {
            addCriterion("STT not between", value1, value2, "stt");
            return (Criteria) this;
        }

        public Criteria andRegisttimeIsNull() {
            addCriterion("REGISTTIME is null");
            return (Criteria) this;
        }

        public Criteria andRegisttimeIsNotNull() {
            addCriterion("REGISTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRegisttimeEqualTo(String value) {
            addCriterion("REGISTTIME =", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeNotEqualTo(String value) {
            addCriterion("REGISTTIME <>", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeGreaterThan(String value) {
            addCriterion("REGISTTIME >", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTTIME >=", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeLessThan(String value) {
            addCriterion("REGISTTIME <", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeLessThanOrEqualTo(String value) {
            addCriterion("REGISTTIME <=", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeLike(String value) {
            addCriterion("REGISTTIME like", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeNotLike(String value) {
            addCriterion("REGISTTIME not like", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeIn(List<String> values) {
            addCriterion("REGISTTIME in", values, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeNotIn(List<String> values) {
            addCriterion("REGISTTIME not in", values, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeBetween(String value1, String value2) {
            addCriterion("REGISTTIME between", value1, value2, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeNotBetween(String value1, String value2) {
            addCriterion("REGISTTIME not between", value1, value2, "registtime");
            return (Criteria) this;
        }

        public Criteria andIntrosalerIsNull() {
            addCriterion("INTROSALER is null");
            return (Criteria) this;
        }

        public Criteria andIntrosalerIsNotNull() {
            addCriterion("INTROSALER is not null");
            return (Criteria) this;
        }

        public Criteria andIntrosalerEqualTo(String value) {
            addCriterion("INTROSALER =", value, "introsaler");
            return (Criteria) this;
        }

        public Criteria andIntrosalerNotEqualTo(String value) {
            addCriterion("INTROSALER <>", value, "introsaler");
            return (Criteria) this;
        }

        public Criteria andIntrosalerGreaterThan(String value) {
            addCriterion("INTROSALER >", value, "introsaler");
            return (Criteria) this;
        }

        public Criteria andIntrosalerGreaterThanOrEqualTo(String value) {
            addCriterion("INTROSALER >=", value, "introsaler");
            return (Criteria) this;
        }

        public Criteria andIntrosalerLessThan(String value) {
            addCriterion("INTROSALER <", value, "introsaler");
            return (Criteria) this;
        }

        public Criteria andIntrosalerLessThanOrEqualTo(String value) {
            addCriterion("INTROSALER <=", value, "introsaler");
            return (Criteria) this;
        }

        public Criteria andIntrosalerLike(String value) {
            addCriterion("INTROSALER like", value, "introsaler");
            return (Criteria) this;
        }

        public Criteria andIntrosalerNotLike(String value) {
            addCriterion("INTROSALER not like", value, "introsaler");
            return (Criteria) this;
        }

        public Criteria andIntrosalerIn(List<String> values) {
            addCriterion("INTROSALER in", values, "introsaler");
            return (Criteria) this;
        }

        public Criteria andIntrosalerNotIn(List<String> values) {
            addCriterion("INTROSALER not in", values, "introsaler");
            return (Criteria) this;
        }

        public Criteria andIntrosalerBetween(String value1, String value2) {
            addCriterion("INTROSALER between", value1, value2, "introsaler");
            return (Criteria) this;
        }

        public Criteria andIntrosalerNotBetween(String value1, String value2) {
            addCriterion("INTROSALER not between", value1, value2, "introsaler");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("CHANNEL =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("CHANNEL <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("CHANNEL >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("CHANNEL <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("CHANNEL like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("CHANNEL not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("CHANNEL in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("CHANNEL not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("CHANNEL between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("CHANNEL not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andCanceltimeIsNull() {
            addCriterion("CANCELTIME is null");
            return (Criteria) this;
        }

        public Criteria andCanceltimeIsNotNull() {
            addCriterion("CANCELTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCanceltimeEqualTo(String value) {
            addCriterion("CANCELTIME =", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeNotEqualTo(String value) {
            addCriterion("CANCELTIME <>", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeGreaterThan(String value) {
            addCriterion("CANCELTIME >", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeGreaterThanOrEqualTo(String value) {
            addCriterion("CANCELTIME >=", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeLessThan(String value) {
            addCriterion("CANCELTIME <", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeLessThanOrEqualTo(String value) {
            addCriterion("CANCELTIME <=", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeLike(String value) {
            addCriterion("CANCELTIME like", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeNotLike(String value) {
            addCriterion("CANCELTIME not like", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeIn(List<String> values) {
            addCriterion("CANCELTIME in", values, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeNotIn(List<String> values) {
            addCriterion("CANCELTIME not in", values, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeBetween(String value1, String value2) {
            addCriterion("CANCELTIME between", value1, value2, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeNotBetween(String value1, String value2) {
            addCriterion("CANCELTIME not between", value1, value2, "canceltime");
            return (Criteria) this;
        }

        public Criteria andGesturePwdIsNull() {
            addCriterion("GESTURE_PWD is null");
            return (Criteria) this;
        }

        public Criteria andGesturePwdIsNotNull() {
            addCriterion("GESTURE_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andGesturePwdEqualTo(String value) {
            addCriterion("GESTURE_PWD =", value, "gesturePwd");
            return (Criteria) this;
        }

        public Criteria andGesturePwdNotEqualTo(String value) {
            addCriterion("GESTURE_PWD <>", value, "gesturePwd");
            return (Criteria) this;
        }

        public Criteria andGesturePwdGreaterThan(String value) {
            addCriterion("GESTURE_PWD >", value, "gesturePwd");
            return (Criteria) this;
        }

        public Criteria andGesturePwdGreaterThanOrEqualTo(String value) {
            addCriterion("GESTURE_PWD >=", value, "gesturePwd");
            return (Criteria) this;
        }

        public Criteria andGesturePwdLessThan(String value) {
            addCriterion("GESTURE_PWD <", value, "gesturePwd");
            return (Criteria) this;
        }

        public Criteria andGesturePwdLessThanOrEqualTo(String value) {
            addCriterion("GESTURE_PWD <=", value, "gesturePwd");
            return (Criteria) this;
        }

        public Criteria andGesturePwdLike(String value) {
            addCriterion("GESTURE_PWD like", value, "gesturePwd");
            return (Criteria) this;
        }

        public Criteria andGesturePwdNotLike(String value) {
            addCriterion("GESTURE_PWD not like", value, "gesturePwd");
            return (Criteria) this;
        }

        public Criteria andGesturePwdIn(List<String> values) {
            addCriterion("GESTURE_PWD in", values, "gesturePwd");
            return (Criteria) this;
        }

        public Criteria andGesturePwdNotIn(List<String> values) {
            addCriterion("GESTURE_PWD not in", values, "gesturePwd");
            return (Criteria) this;
        }

        public Criteria andGesturePwdBetween(String value1, String value2) {
            addCriterion("GESTURE_PWD between", value1, value2, "gesturePwd");
            return (Criteria) this;
        }

        public Criteria andGesturePwdNotBetween(String value1, String value2) {
            addCriterion("GESTURE_PWD not between", value1, value2, "gesturePwd");
            return (Criteria) this;
        }

        public Criteria andGesturePwdStatusIsNull() {
            addCriterion("GESTURE_PWD_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andGesturePwdStatusIsNotNull() {
            addCriterion("GESTURE_PWD_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andGesturePwdStatusEqualTo(String value) {
            addCriterion("GESTURE_PWD_STATUS =", value, "gesturePwdStatus");
            return (Criteria) this;
        }

        public Criteria andGesturePwdStatusNotEqualTo(String value) {
            addCriterion("GESTURE_PWD_STATUS <>", value, "gesturePwdStatus");
            return (Criteria) this;
        }

        public Criteria andGesturePwdStatusGreaterThan(String value) {
            addCriterion("GESTURE_PWD_STATUS >", value, "gesturePwdStatus");
            return (Criteria) this;
        }

        public Criteria andGesturePwdStatusGreaterThanOrEqualTo(String value) {
            addCriterion("GESTURE_PWD_STATUS >=", value, "gesturePwdStatus");
            return (Criteria) this;
        }

        public Criteria andGesturePwdStatusLessThan(String value) {
            addCriterion("GESTURE_PWD_STATUS <", value, "gesturePwdStatus");
            return (Criteria) this;
        }

        public Criteria andGesturePwdStatusLessThanOrEqualTo(String value) {
            addCriterion("GESTURE_PWD_STATUS <=", value, "gesturePwdStatus");
            return (Criteria) this;
        }

        public Criteria andGesturePwdStatusLike(String value) {
            addCriterion("GESTURE_PWD_STATUS like", value, "gesturePwdStatus");
            return (Criteria) this;
        }

        public Criteria andGesturePwdStatusNotLike(String value) {
            addCriterion("GESTURE_PWD_STATUS not like", value, "gesturePwdStatus");
            return (Criteria) this;
        }

        public Criteria andGesturePwdStatusIn(List<String> values) {
            addCriterion("GESTURE_PWD_STATUS in", values, "gesturePwdStatus");
            return (Criteria) this;
        }

        public Criteria andGesturePwdStatusNotIn(List<String> values) {
            addCriterion("GESTURE_PWD_STATUS not in", values, "gesturePwdStatus");
            return (Criteria) this;
        }

        public Criteria andGesturePwdStatusBetween(String value1, String value2) {
            addCriterion("GESTURE_PWD_STATUS between", value1, value2, "gesturePwdStatus");
            return (Criteria) this;
        }

        public Criteria andGesturePwdStatusNotBetween(String value1, String value2) {
            addCriterion("GESTURE_PWD_STATUS not between", value1, value2, "gesturePwdStatus");
            return (Criteria) this;
        }

        public Criteria andMoblieImeiIsNull() {
            addCriterion("MOBLIE_IMEI is null");
            return (Criteria) this;
        }

        public Criteria andMoblieImeiIsNotNull() {
            addCriterion("MOBLIE_IMEI is not null");
            return (Criteria) this;
        }

        public Criteria andMoblieImeiEqualTo(String value) {
            addCriterion("MOBLIE_IMEI =", value, "moblieImei");
            return (Criteria) this;
        }

        public Criteria andMoblieImeiNotEqualTo(String value) {
            addCriterion("MOBLIE_IMEI <>", value, "moblieImei");
            return (Criteria) this;
        }

        public Criteria andMoblieImeiGreaterThan(String value) {
            addCriterion("MOBLIE_IMEI >", value, "moblieImei");
            return (Criteria) this;
        }

        public Criteria andMoblieImeiGreaterThanOrEqualTo(String value) {
            addCriterion("MOBLIE_IMEI >=", value, "moblieImei");
            return (Criteria) this;
        }

        public Criteria andMoblieImeiLessThan(String value) {
            addCriterion("MOBLIE_IMEI <", value, "moblieImei");
            return (Criteria) this;
        }

        public Criteria andMoblieImeiLessThanOrEqualTo(String value) {
            addCriterion("MOBLIE_IMEI <=", value, "moblieImei");
            return (Criteria) this;
        }

        public Criteria andMoblieImeiLike(String value) {
            addCriterion("MOBLIE_IMEI like", value, "moblieImei");
            return (Criteria) this;
        }

        public Criteria andMoblieImeiNotLike(String value) {
            addCriterion("MOBLIE_IMEI not like", value, "moblieImei");
            return (Criteria) this;
        }

        public Criteria andMoblieImeiIn(List<String> values) {
            addCriterion("MOBLIE_IMEI in", values, "moblieImei");
            return (Criteria) this;
        }

        public Criteria andMoblieImeiNotIn(List<String> values) {
            addCriterion("MOBLIE_IMEI not in", values, "moblieImei");
            return (Criteria) this;
        }

        public Criteria andMoblieImeiBetween(String value1, String value2) {
            addCriterion("MOBLIE_IMEI between", value1, value2, "moblieImei");
            return (Criteria) this;
        }

        public Criteria andMoblieImeiNotBetween(String value1, String value2) {
            addCriterion("MOBLIE_IMEI not between", value1, value2, "moblieImei");
            return (Criteria) this;
        }

        public Criteria andPwdErrortimeIsNull() {
            addCriterion("PWD_ERRORTIME is null");
            return (Criteria) this;
        }

        public Criteria andPwdErrortimeIsNotNull() {
            addCriterion("PWD_ERRORTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPwdErrortimeEqualTo(Short value) {
            addCriterion("PWD_ERRORTIME =", value, "pwdErrortime");
            return (Criteria) this;
        }

        public Criteria andPwdErrortimeNotEqualTo(Short value) {
            addCriterion("PWD_ERRORTIME <>", value, "pwdErrortime");
            return (Criteria) this;
        }

        public Criteria andPwdErrortimeGreaterThan(Short value) {
            addCriterion("PWD_ERRORTIME >", value, "pwdErrortime");
            return (Criteria) this;
        }

        public Criteria andPwdErrortimeGreaterThanOrEqualTo(Short value) {
            addCriterion("PWD_ERRORTIME >=", value, "pwdErrortime");
            return (Criteria) this;
        }

        public Criteria andPwdErrortimeLessThan(Short value) {
            addCriterion("PWD_ERRORTIME <", value, "pwdErrortime");
            return (Criteria) this;
        }

        public Criteria andPwdErrortimeLessThanOrEqualTo(Short value) {
            addCriterion("PWD_ERRORTIME <=", value, "pwdErrortime");
            return (Criteria) this;
        }

        public Criteria andPwdErrortimeIn(List<Short> values) {
            addCriterion("PWD_ERRORTIME in", values, "pwdErrortime");
            return (Criteria) this;
        }

        public Criteria andPwdErrortimeNotIn(List<Short> values) {
            addCriterion("PWD_ERRORTIME not in", values, "pwdErrortime");
            return (Criteria) this;
        }

        public Criteria andPwdErrortimeBetween(Short value1, Short value2) {
            addCriterion("PWD_ERRORTIME between", value1, value2, "pwdErrortime");
            return (Criteria) this;
        }

        public Criteria andPwdErrortimeNotBetween(Short value1, Short value2) {
            addCriterion("PWD_ERRORTIME not between", value1, value2, "pwdErrortime");
            return (Criteria) this;
        }

        public Criteria andPayPwdIsNull() {
            addCriterion("PAY_PWD is null");
            return (Criteria) this;
        }

        public Criteria andPayPwdIsNotNull() {
            addCriterion("PAY_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andPayPwdEqualTo(String value) {
            addCriterion("PAY_PWD =", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotEqualTo(String value) {
            addCriterion("PAY_PWD <>", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdGreaterThan(String value) {
            addCriterion("PAY_PWD >", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_PWD >=", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdLessThan(String value) {
            addCriterion("PAY_PWD <", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdLessThanOrEqualTo(String value) {
            addCriterion("PAY_PWD <=", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdLike(String value) {
            addCriterion("PAY_PWD like", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotLike(String value) {
            addCriterion("PAY_PWD not like", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdIn(List<String> values) {
            addCriterion("PAY_PWD in", values, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotIn(List<String> values) {
            addCriterion("PAY_PWD not in", values, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdBetween(String value1, String value2) {
            addCriterion("PAY_PWD between", value1, value2, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotBetween(String value1, String value2) {
            addCriterion("PAY_PWD not between", value1, value2, "payPwd");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeIsNull() {
            addCriterion("LASTLOGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeIsNotNull() {
            addCriterion("LASTLOGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeEqualTo(String value) {
            addCriterion("LASTLOGIN_TIME =", value, "lastloginTime");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeNotEqualTo(String value) {
            addCriterion("LASTLOGIN_TIME <>", value, "lastloginTime");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeGreaterThan(String value) {
            addCriterion("LASTLOGIN_TIME >", value, "lastloginTime");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LASTLOGIN_TIME >=", value, "lastloginTime");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeLessThan(String value) {
            addCriterion("LASTLOGIN_TIME <", value, "lastloginTime");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeLessThanOrEqualTo(String value) {
            addCriterion("LASTLOGIN_TIME <=", value, "lastloginTime");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeLike(String value) {
            addCriterion("LASTLOGIN_TIME like", value, "lastloginTime");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeNotLike(String value) {
            addCriterion("LASTLOGIN_TIME not like", value, "lastloginTime");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeIn(List<String> values) {
            addCriterion("LASTLOGIN_TIME in", values, "lastloginTime");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeNotIn(List<String> values) {
            addCriterion("LASTLOGIN_TIME not in", values, "lastloginTime");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeBetween(String value1, String value2) {
            addCriterion("LASTLOGIN_TIME between", value1, value2, "lastloginTime");
            return (Criteria) this;
        }

        public Criteria andLastloginTimeNotBetween(String value1, String value2) {
            addCriterion("LASTLOGIN_TIME not between", value1, value2, "lastloginTime");
            return (Criteria) this;
        }

        public Criteria andInvitionCodeIsNull() {
            addCriterion("INVITION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andInvitionCodeIsNotNull() {
            addCriterion("INVITION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andInvitionCodeEqualTo(String value) {
            addCriterion("INVITION_CODE =", value, "invitionCode");
            return (Criteria) this;
        }

        public Criteria andInvitionCodeNotEqualTo(String value) {
            addCriterion("INVITION_CODE <>", value, "invitionCode");
            return (Criteria) this;
        }

        public Criteria andInvitionCodeGreaterThan(String value) {
            addCriterion("INVITION_CODE >", value, "invitionCode");
            return (Criteria) this;
        }

        public Criteria andInvitionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INVITION_CODE >=", value, "invitionCode");
            return (Criteria) this;
        }

        public Criteria andInvitionCodeLessThan(String value) {
            addCriterion("INVITION_CODE <", value, "invitionCode");
            return (Criteria) this;
        }

        public Criteria andInvitionCodeLessThanOrEqualTo(String value) {
            addCriterion("INVITION_CODE <=", value, "invitionCode");
            return (Criteria) this;
        }

        public Criteria andInvitionCodeLike(String value) {
            addCriterion("INVITION_CODE like", value, "invitionCode");
            return (Criteria) this;
        }

        public Criteria andInvitionCodeNotLike(String value) {
            addCriterion("INVITION_CODE not like", value, "invitionCode");
            return (Criteria) this;
        }

        public Criteria andInvitionCodeIn(List<String> values) {
            addCriterion("INVITION_CODE in", values, "invitionCode");
            return (Criteria) this;
        }

        public Criteria andInvitionCodeNotIn(List<String> values) {
            addCriterion("INVITION_CODE not in", values, "invitionCode");
            return (Criteria) this;
        }

        public Criteria andInvitionCodeBetween(String value1, String value2) {
            addCriterion("INVITION_CODE between", value1, value2, "invitionCode");
            return (Criteria) this;
        }

        public Criteria andInvitionCodeNotBetween(String value1, String value2) {
            addCriterion("INVITION_CODE not between", value1, value2, "invitionCode");
            return (Criteria) this;
        }
    }

    /**
     * CF_USER_INFO
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * CF_USER_INFO null
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}