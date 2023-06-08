
SELECT *
FROM Patient
LEFT JOIN Appointment ON Patient.patient_id = Appointment.patient_id;
SELECT *
FROM Doctor
RIGHT JOIN Prescription ON Doctor.doctor_id = Prescription.doctor_id;
SELECT *
FROM Patient
INNER JOIN Appointment ON Patient.patient_id = Appointment.patient_id
INNER JOIN Doctor ON Appointment.doctor_id = Doctor.doctor_id;
SELECT *
FROM Patient
INNER JOIN Appointment ON Patient.patient_id = Appointment.patient_id
INNER JOIN Doctor ON Appointment.doctor_id = Doctor.doctor_id;
SELECT *
FROM Patient
LEFT JOIN MedicalRecord ON Patient.patient_id = MedicalRecord.patient_id;
SELECT *
FROM Patient
LEFT JOIN MedicalRecord ON Patient.patient_id = MedicalRecord.patient_id;
SELECT department_id, COUNT(*) AS patient_count
FROM Patient
GROUP BY department_id;
SELECT p1.name AS patient1, p2.name AS patient2, d.name AS doctor
FROM Patient p1
JOIN Patient p2 ON p1.doctor_id = p2.doctor_id
JOIN Doctor d ON p1.doctor_id = d.doctor_id
WHERE p1.patient_id <> p2.patient_id;
SELECT department_id, COUNT(*) AS patient_count
FROM Patient
GROUP BY department_id;
SELECT department_id, AVG(DATEDIFF(CURRENT_DATE, date_of_birth)) AS avg_age
FROM Patient
GROUP BY department_id;
SELECT department_id, MAX(DATEDIFF(CURRENT_DATE, date_of_birth)) AS max_age
FROM Patient
GROUP BY department_id;
SELECT doctor_id, COUNT(*) AS appointment_count
FROM Appointment
GROUP BY doctor_id;
SELECT patient_id, SUM(amount) AS total_amount
FROM Invoice
GROUP BY patient_id;
SELECT patient_id, MIN(test_result) AS min_test_result
FROM Test
GROUP BY patient_id;
SELECT ward_id, AVG(DATEDIFF(discharge_date, admission_date)) AS avg_length_of_stay
FROM Admission
GROUP BY ward_id;
SELECT department_id, COUNT(*) AS patient_count
FROM Patient
GROUP BY department_id
HAVING patient_count > 5;
SELECT department_id, AVG(DATEDIFF(CURRENT_DATE, date_of_birth)) AS avg_age
FROM Patient
GROUP BY department_id
HAVING COUNT(*) >= 3;
SELECT doctor_id, COUNT(*) AS appointment_count
FROM Appointment
GROUP BY doctor_id
HAVING appointment_count > 10;
SELECT patient_id, SUM(amount) AS total_amount
FROM Invoice
GROUP BY patient_id
HAVING total_amount > 500;
SELECT patient_id, COUNT(*) AS record_count
FROM MedicalRecord
GROUP BY patient_id
HAVING record_count > 3;
SELECT patient_id, MAX(test_result) AS max_test_result
FROM Test
GROUP BY patient_id
HAVING COUNT(*) >= 2;
SELECT ward_id, AVG(DATEDIFF(discharge_date, admission_date)) AS avg_length_of_stay
FROM Admission
GROUP BY ward_id
HAVING avg_length_of_stay > 7;
ALTER TABLE Patient ADD COLUMN email VARCHAR(255);
ALTER TABLE Doctor MODIFY COLUMN phone_number VARCHAR(20);
ALTER TABLE Appointment RENAME COLUMN appointment_time TO start_time;
ALTER TABLE Prescription ADD CONSTRAINT fk_prescription_doctor
  FOREIGN KEY (doctor_id) REFERENCES Doctor(doctor_id);
ALTER TABLE Department DROP COLUMN location;UPDATE Patient SET phone_number = '555-123-4567' WHERE patient_id = 1;
UPDATE Doctor SET specialization = 'Gynecology' WHERE doctor_id = 2;
UPDATE Appointment SET appointment_date = '2023-06-10' WHERE appointment_id = 3;
UPDATE Prescription SET medication = 'Omeprazole' WHERE prescription_id = 4;
UPDATE Test SET test_result = 'Negative' WHERE test_id = 5;
UPDATE MedicalRecord SET description = 'Patient had a minor allergic reaction.' WHERE record_id = 2;
UPDATE Department SET location = 'East Wing' WHERE department_id = 3;
UPDATE Admission SET discharge_date = '2023-06-10' WHERE admission_id = 4;
UPDATE Ward SET name = 'Dermatology Unit' WHERE ward_id = 5;
UPDATE Bed SET availability = 'Occupied' WHERE bed_id = 3;
DELETE FROM Patient WHERE patient_id = 1;
DELETE FROM Doctor WHERE doctor_id = 3;
DELETE FROM Appointment WHERE appointment_id = 2;
DELETE FROM Appointment WHERE appointment_id = 2;
DELETE FROM Test WHERE test_id = 5;
DELETE FROM MedicalRecord WHERE record_id = 3;
DELETE FROM Department WHERE department_id = 4;
DELETE FROM Admission WHERE admission_id = 5;
DELETE FROM Ward WHERE ward_id = 1;
DELETE FROM Bed WHERE bed_id = 2;SELECT *
FROM Patient
JOIN Doctor ON Patient.patient_id = Doctor.patient_id
JOIN Appointment ON Patient.patient_id = Appointment.patient_id
JOIN Prescription ON Patient.patient_id = Prescription.patient_id
JOIN Test ON Patient.patient_id = Test.patient_id
JOIN MedicalRecord ON Patient.patient_id = MedicalRecord.patient_id
JOIN Department ON Patient.patient_id = Department.patient_id
JOIN Admission ON Patient.patient_id = Admission.patient_id
JOIN Ward ON Patient.patient_id = Ward.patient_id
JOIN Bed ON Patient.patient_id = Bed.patient_id
JOIN Invoice ON Patient.patient_id = Invoice.patient_id
JOIN Insurance ON Patient.patient_id = Insurance.patient_id;