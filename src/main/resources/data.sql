-- Categories
INSERT INTO risk_category(id, name) VALUES
                                        (1, 'Business'),
                                        (2, 'Technical'),
                                        (3, 'Operational');

-- Criteria
INSERT INTO risk_criteria(id, category_id, name) VALUES
                                                     (1, 1, 'Financial Impact'),
                                                     (2, 1, 'Market Competition'),
                                                     (3, 2, 'System Stability'),
                                                     (4, 3, 'Staff Training'),
                                                     (5, 1, 'Regulatory Compliance'),
                                                     (6, 2, 'Technical Debt'),
                                                     (7, 2, 'Scalability'),
                                                     (8, 3, 'Supply Chain'),
                                                     (9, 3, 'Process Efficiency');

-- Questions
INSERT INTO risk_question(id, criteria_id, text) VALUES
                                                     (1, 1, 'What is the budget impact?'),
                                                     (2, 1, 'How would competitors react?'),
                                                     (3, 3, 'What uptime is required?'),
                                                     (4, 4, 'What training resources exist?'),
                                                     (5, 1, 'How would a 20% budget cut affect operations?'),
                                                     (6, 1, 'What''s the maximum potential revenue loss from this risk?'),
                                                     (7, 1, 'How dependent are we on a single revenue stream?'),
                                                     (8, 2, 'How quickly could competitors replicate our solution?'),
                                                     (9, 2, 'What''s our market share vulnerability this quarter?'),
                                                     (10, 2, 'How sensitive are customers to price changes?'),
                                                     (11, 5, 'What fines could we face for non-compliance?'),
                                                     (12, 5, 'How often do regulations in our sector change?'),
                                                     (13, 5, 'What''s the cost of compliance certification?'),
                                                     (14, 3, 'What''s our historical monthly uptime percentage?'),
                                                     (15, 3, 'How many critical bugs were reported last month?'),
                                                     (16, 3, 'What''s the average incident resolution time?'),
                                                     (17, 6, 'What percentage of code lacks unit tests?'),
                                                     (18, 6, 'How many deprecated libraries are in use?'),
                                                     (19, 6, 'What''s the estimated refactoring backlog (in weeks)?'),
                                                     (20, 7, 'At what user load does performance degrade by 50%?'),
                                                     (21, 7, 'How many concurrent users can the system handle?'),
                                                     (22, 4, 'What percentage of staff completed annual training?'),
                                                     (23, 4, 'How many roles lack succession plans?'),
                                                     (24, 8, 'How many single-source suppliers do we have?'),
                                                     (25, 8, 'What''s our inventory buffer stock (in days)?'),
                                                     (26, 9, 'How many manual approval steps exist in core workflows?'),
                                                     (27, 9, 'What''s the average document processing time?');
