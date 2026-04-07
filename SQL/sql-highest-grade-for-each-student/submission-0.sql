-- Write your query below
Select Distinct ON (student_id) student_id, exam_id, score from exam_results Order by  student_id,score DESC,exam_id ;
