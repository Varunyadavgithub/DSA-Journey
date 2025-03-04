package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* Maximum meetings in one room. (Leetcode 1353)
 * There is one meeting room in a firm, There are N meetings in the form of (S[i],F[i]) where
 * S[i] is the start time of meeting 'i' and F[i] is the finish time of the meeting 'i'. The task 
 * is to find the maximum number of meetings that can be accommodated in the meeting room. Print all
 * meeting numbers.
 * 
 * Input:- S[]={1,3,0,5,8,5} and F[]={2,4,6,7,9,9}
 * Output:- 1,2,4,5
 */

public class MaxMeetingRoom { // T.c = O(NlogN) and S.C = O(N)
    public static class Meeting {
        Integer startTime;
        Integer finishTime;
        Integer meetingNumber;

        public String toString() {
            return startTime + " " + finishTime;
        }
    }

    public static class MeetingComparator implements Comparator<Meeting> {
        public int compare(Meeting m1, Meeting m2) {
            if (m1.finishTime > m2.finishTime)
                return 1;
            else if (m1.finishTime < m2.finishTime)
                return -1;
            else
                return 0;
        }
    }

    public static void main(String[] args) {
        List<Integer> start = List.of(1, 3, 0, 5, 8, 5);
        List<Integer> finish = List.of(2, 4, 6, 7, 9, 9);
        List<Meeting> meetings = new ArrayList<>();

        for (int i = 0; i < start.size(); i++) {
            Meeting meeting = new Meeting();
            meeting.startTime = start.get(i);
            meeting.finishTime = finish.get(i);
            meeting.meetingNumber = i + 1;
            meetings.add(meeting);
        }
        meetings.sort(new MeetingComparator());

        List<Integer> res = new ArrayList<>();
        res.add(meetings.get(0).meetingNumber);
        Meeting onGoMeeting = meetings.get(0);
        for (int i = 1; i < meetings.size(); i++) {
            Meeting currMeeting = meetings.get(i);
            if (currMeeting.startTime > onGoMeeting.finishTime) {
                res.add(currMeeting.meetingNumber);
                onGoMeeting = currMeeting;
            }
        }
        System.out.println(meetings);
        System.out.println(res);
    }
}
