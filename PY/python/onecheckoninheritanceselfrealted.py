class School:

    salary=600

    # def updateSalary(self, sal):
    #     self.__class__.salary=sal

    @classmethod
    def updateSalary(sef, sal):
        sef.salary=sal


s=School()
print(s.salary)
s.updateSalary(4855)
print(s.salary)
print(School.salary)
